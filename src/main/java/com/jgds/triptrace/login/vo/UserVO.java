package com.jgds.triptrace.login.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class UserVO {

    private String userType;
    private int userNum;
    private String userToken;
    private int userAuth;
    private String userId;
    private String userPw;
    private String userEmail;
    private String userStatus;
    private String userNickname;
    private String userIp;
    private String userLoginTime;

}
