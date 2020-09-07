package com.jgds.triptrace.main.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@ToString
public class BoardVO {

    private int seq; // 게시글 번호
    private String groupName; // 게시글 그룹 이름
    private String path; // 그룹 경로
    private String showDate; // 보여지는 날짜
    private String showTitle; // 보여지는 제목
    private String showPlace; // 보여지는 장소
    private String showContent; // 보여지는 내용
    private String delYn; // 삭제 여부
    private String regId; // 등록자 Id
    private String regDate; // 등록 날짜
    
}
