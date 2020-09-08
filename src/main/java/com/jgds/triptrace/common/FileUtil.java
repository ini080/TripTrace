package com.jgds.triptrace.common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
public class FileUtil {

    private static final Logger log = LoggerFactory.getLogger(FileUtil.class);

    //private static final String base_directory = "C:\\Java\\UploadImage\\";

    private static final String base_directory = "C:\\Java\\Intelij\\src\\main\\resources\\static\\images\\";

    public static List<HashMap<String,String>> uploadFile(MultipartHttpServletRequest request) throws IOException {

        List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();

        String filePath = "";        //서버별 물리경로 구함.

        String directory_cert = "cert/";
        String directory_prodImg = "productImage/";
        String directory_user = "userImage/";
        String originalFileName = "";
        String originalFileExtension = "";
        String storedFileName = "";

        Iterator<String> itr =  request.getFileNames();

        while(itr.hasNext()) {
            MultipartFile mpf = request.getFile(itr.next());
            if(mpf.isEmpty() == false){
                filePath = request.getSession().getServletContext().getRealPath("/")+"/resource/upload/";
                originalFileName = mpf.getOriginalFilename();
                originalFileExtension = originalFileName.substring(originalFileName.indexOf("."));
                storedFileName = createFileName() + originalFileExtension;

                HashMap<String, String> map = new HashMap<String, String>();

                SimpleDateFormat format1 = new SimpleDateFormat ( "yyyyMMdd");
                Date time = new Date();
                String fileName = format1.format(time);

                if(mpf.getName().contains("prodImg")){                                                                    //상품이미지
                    filePath += directory_prodImg+fileName+"/";
                    map.put("fileType", "PROD_IMG");
                    map.put("fileNm", storedFileName);
                    map.put("filePath", directory_prodImg+fileName+"/");
                }


                result.add(map);

                File file = new File(filePath);
                if(file.exists() == false){
                    file.mkdirs();
                }

                file = new File(filePath + storedFileName);        //상품이미지경로 + 현재일자폴더생성 + 파일명
                mpf.transferTo(file);

                log.info(mpf.getOriginalFilename() +" uploaded!");
                log.info("file length : " + mpf.getBytes().length);
                log.info("file name : " + mpf.getOriginalFilename());
            }
        }

        return result;
    }

    public static String createFileName(){

        SimpleDateFormat format1 = new SimpleDateFormat ( "yyyyMMdd");
        Date time = new Date();
        String fileName = format1.format(time);

        Random random = new Random();
        fileName += String.valueOf(random.nextInt(100000));
        return fileName;
    }

    public static String nowDate(){

        SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        Date time = new Date();

        return format1.format(time);
    }

    public static String createPath(String place,String date){

        return base_directory + place + "_" + date;
    }

    public static String getBase_directory(){
        return base_directory;
    }
}
