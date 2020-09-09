package com.jgds.triptrace.common;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;

public class FileUtil {

    private static final Logger log = LoggerFactory.getLogger(FileUtil.class);

    //private static final String base_directory = "C:\\Java\\UploadImage\\";

//    private static final String base_directory = "C:\\Java\\Intelij\\src\\main\\resources\\static\\images\\";
    private static final String base_directory = "C:\\Java\\UploadImage\\";

    public static String createFileName(String fileName){

        SimpleDateFormat format1 = new SimpleDateFormat ( "yyyyMMddHHmmssSSS");
        System.out.println("넘어온 파일네임 : " + fileName);
        Date time = new Date();
        String getTime = format1.format(time);

        //Random random = new Random();
        //fileName += String.valueOf(random.nextInt(100000));
        return getTime + "_" + fileName;
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


    public static void printMsg(HttpServletResponse response, String message) throws IOException{
        PrintWriter pw = null;
        try{
            response.setContentType("text/html; charset=EUC-KR");

            pw = response.getWriter();
            pw.println("<html><head>");
            pw.println("<script>alert(\"" + message + "\");</script>");
            pw.println("</head><body></body></html>");
            pw.flush();;
        }finally {
            if(pw!=null) pw.close();
        }
    }
}
