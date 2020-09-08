package com.jgds.triptrace.main.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Alias("FileVO")
@Getter
@Setter
@ToString
public class FileVO {

    private int fileGroupSeq;
    private String fileGroup;
    private int fileSeq;
    private String originName;
    private String saveName;
    private String path;
    private String fileExtension;
    private double fileSize; // 파일 크기
    private String regId;
    private String regDate;
    private String delYn;
    private int seqOrder;

}
