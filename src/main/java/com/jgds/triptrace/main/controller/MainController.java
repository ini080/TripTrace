package com.jgds.triptrace.main.controller;

import com.jgds.triptrace.common.FileUtil;
import com.jgds.triptrace.login.service.UserService;
import com.jgds.triptrace.login.vo.UserVO;
import com.jgds.triptrace.main.service.BoardService;
import com.jgds.triptrace.main.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value= "/loginSuccess.do")
    public String loginSuccess(Model model){
        return "/Main/mainPage";
    }

    @RequestMapping(value= "/Main/home.do")
    public String mainHome(Model model){
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

    @RequestMapping(value= "/Main/uploadFile.do", method = RequestMethod.POST)
    public String loginTry(@RequestParam("files") List<MultipartFile> files, HttpServletRequest request,Model model) throws  Exception {
        String paramTitle = request.getParameter("title");
        String paramDate = request.getParameter("date");
        String paramPlace = request.getParameter("place");
        String paramMessage = request.getParameter("message");

        SimpleDateFormat format1 = new SimpleDateFormat ( "yyyyMMdd");
        Date time = new Date();
        String fileName = format1.format(time);

        BoardVO board = new BoardVO();
        board.setShowTitle(paramTitle);
        board.setShowContent(paramMessage);
        board.setShowDate(paramDate);
        board.setShowPlace(paramPlace);
        board.setGroupName(paramPlace+"_"+paramDate);
        board.setPath(FileUtil.createPath(paramPlace,paramDate));
        board.setDelYn("N");
        board.setRegId("정건");
        board.setRegDate(FileUtil.nowDate());

        boardService.insertBoard(board);

        System.out.println("파람 타이틀 : "  + paramTitle);
        for(int i = 0 ; i < files.size(); i++){
            MultipartFile file = files.get(i);
            System.out.println(file.getName());
            System.out.println(file.getSize());
            System.out.println(file.getOriginalFilename());
            byte[] data = file.getBytes();
        }

        model.addAttribute("msg","정상적으로 등록되었습니다.");
        return "/Main/WriteBoard";

    }
}
