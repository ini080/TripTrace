package com.jgds.triptrace.main.controller;

import com.jgds.triptrace.common.FileUtil;
import com.jgds.triptrace.main.service.BoardService;
import com.jgds.triptrace.main.vo.BoardVO;
import com.jgds.triptrace.main.vo.FileVO;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;

@Controller
public class MainController {

    private

    Logger logger;

    @Autowired
    private BoardService boardService;

    @RequestMapping(value= "/loginSuccess.do")
    public String loginSuccess(Model model,BoardVO boardVO) throws Exception {
        List<BoardVO> list = boardService.selectBoardList(boardVO);
        if(list!=null&&list.size()>0){
            for(int i = 0; i < list.size(); i++ ){
                list.get(i).setThumbNailLocation(URLEncoder.encode(list.get(i).getGroupName(),"utf-8") + "/" +list.get(i).getSaveFileNm());
                System.out.println(list.get(i).toString());
            }
        }
        model.addAttribute("resultList",list);
        return "/Main/mainPage";
    }

    @RequestMapping(value= "/Main/home.do")
    public String mainHome(Model model,BoardVO boardVO) throws Exception {
        List<BoardVO> list = boardService.selectBoardList(boardVO);
        if(list!=null&&list.size()>0){
            for(int i = 0; i < list.size(); i++ ){
                list.get(i).setThumbNailLocation(URLEncoder.encode(list.get(i).getGroupName(),"utf-8") + "/" +list.get(i).getSaveFileNm());
                System.out.println(list.get(i).toString());
            }
        }

        model.addAttribute("resultList",list);
        return "/Main/mainPage";
    }

    @RequestMapping(value= "/Main/About.do")
    public String mainAbout(Model model){
        return "/Main/about";
    }

    @RequestMapping(value= "/Main/Contatct.do")
    public String mainContatct(Model model){
        return "/Main/contact";
    }

    @RequestMapping(value= "/Main/Gallery.do")
    public String mainGallery(Model model){
        return "/Main/gallery";
    }

    @RequestMapping(value= "/Main/Pricing.do")
    public String mainPricing(Model model){
        return "/Main/pricing";
    }

    @RequestMapping(value= "/Main/Single.do")
    public String mainSinglet(Model model){
        return "/Main/single";
    }

    @RequestMapping(value= "/Main/WriteBoard.do")
    public String mainWriteBoard(Model model){
        return "/Main/WriteBoard";
    }

    /**
     /* @Desc : 글 쓰기
     /* @Param : files  - 첨부파일 사진들, paramThumbNail - 썸네일, boardVO - 생성될 Board 객체
     */
    @RequestMapping(value= "/Main/uploadFile.do", method = RequestMethod.POST)
    public String uploadFile(@RequestParam("files") List<MultipartFile> files, @RequestParam("thumbNail") MultipartFile paramThumbNail,HttpServletRequest request,Model model,BoardVO boardVO) throws  Exception {

        // 게시글 등록
        boardVO.setShowPickture(paramThumbNail.getOriginalFilename());  // 썸네일 파일명
        boardVO.setGroupName(boardVO.getShowDate() + "_" + boardVO.getShowPlace()); // 날짜+장소 -> 그룹명
        boardVO.setPath(FileUtil.createPath(boardVO.getShowDate(),boardVO.getShowPlace())); // 해당 게시판 첨부파일 저장 경로 명
        boardVO.setDelYn("N");
        boardVO.setRegId("정건");
        boardVO.setRegDate(FileUtil.nowDate());

        // 썸네일 파일 등록
        FileVO thumbNail = new FileVO();
        String saveThumbNail = saveFile(paramThumbNail,boardVO.getGroupName());
        thumbNail.setFileGroup(boardVO.getGroupName());
        thumbNail.setFileGroupSeq(boardVO.getSeq());
        thumbNail.setOriginName(paramThumbNail.getOriginalFilename());
        thumbNail.setSaveName(saveThumbNail);
        thumbNail.setPath(getDirectory(boardVO.getGroupName()));
        thumbNail.setFileExtension(getFileExtention(paramThumbNail.getOriginalFilename()));
        thumbNail.setFileSize(paramThumbNail.getSize());

        boardVO.setOriginFileNm(thumbNail.getOriginName());
        boardVO.setSaveFileNm(saveThumbNail);

        System.out.println("보드 정보 : " + boardVO.toString());
        System.out.println("썸네일 : " + thumbNail.toString());

        boardService.insertAttachFile(thumbNail);
        boardService.insertBoard(boardVO);

        // 첨부파일 등록
        for (MultipartFile file : files) {
            String saveName = saveFile(file,boardVO.getGroupName());

            FileVO fileVO = new FileVO();
            fileVO.setFileGroup(boardVO.getGroupName());
            fileVO.setFileGroupSeq(boardVO.getSeq());
            fileVO.setOriginName(file.getOriginalFilename());
            fileVO.setSaveName(saveName);
            fileVO.setPath(getDirectory(boardVO.getGroupName()));
            fileVO.setFileExtension(getFileExtention(file.getOriginalFilename()));
            fileVO.setFileSize(file.getSize());

            System.out.println("첨부파일 : " + fileVO.toString());
            boardService.insertAttachFile(fileVO);
        }

        model.addAttribute("msgSuccess","정상적으로 등록되었습니다.");
        return "Main/WriteBoard";
    }
    
    /**
    /* @Desc : 저장된 폴더경로 반환
    /* @Param : subDirectory  - Board 그룹의 디렉토리
    */
    private String getDirectory(String subDirectory){
        return FileUtil.getBase_directory() + subDirectory +"\\";
    }

    /**
     /* @Desc : 파일 확장자 반환
     /* @Param : fileName  - 확장자를 구할 파일 명
     */
    private String getFileExtention(String fileName){
        return fileName.substring(fileName.lastIndexOf(".")+1,fileName.length());
    }

    /**
     /* @Desc : 물리파일 파일 저장
     /* @Param : file  - 저장할 파일, subDirectory - 저장할 파일 경로
     */
    private String saveFile(MultipartFile file,String subDirectory){

        String saveName = FileUtil.createFileName(file.getOriginalFilename());
        System.out.println("저장이름 : " + saveName);
        String savePath = FileUtil.getBase_directory() + subDirectory + "\\";

        File Folder = new File(savePath); //저장 폴더 경로
        File saveFile = new File(savePath, saveName); // 파일 저장

        if( !Folder.exists()){
            System.out.println("생성 폴더명 : " + savePath);
            Folder.mkdir();
        }

        try{
            file.transferTo(saveFile);
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

        return saveName;
    }

    @RequestMapping(value= "/Main/downFile.do")
    public void downFile(HttpServletRequest request, HttpServletResponse response, Model model) throws  Exception{
        String param = request.getParameter("img");
        String downRootPath = FileUtil.getBase_directory();

        String path = downRootPath + param;
        File uFile = new File(path);
        int fSize = (int) uFile.length();

        if( fSize > 0 ){
            System.out.println("존재");
            BufferedInputStream bis = null;
            ServletOutputStream sos = null;

            try{
                bis = new BufferedInputStream(new FileInputStream(uFile));
                sos =  response.getOutputStream();

                response.setContentType("application/octet-stream; charset=UTF-8");
                response.setHeader("Content-Disposition","attachment; filename=\""+ URLEncoder.encode(param,"UTF-8") + "\"" );
                response.setHeader("Content-Transfer-Encoding","binary");
                response.setContentLength(fSize);

                FileCopyUtils.copy(bis,sos);

                sos.flush();
            }catch (Exception e){
                System.out.println("익셉션");
                System.out.println(e.getStackTrace());
            }
            finally {
                if(bis!=null) bis.close();
                if(sos!=null) sos.close();
            }
        }else{
            System.out.println("미존재");
        }
    }

}
