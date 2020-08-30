package com.jgds.triptrace.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class LoginDto {

    private final String userType;
    private final int userNum;
    private final String userToken;
    private final int userAuth;
    private final String userId;
    private final String userPw;
    private final String userEmail;
    private final String userStatus;
    private final String userNickname;
    private final String userIp;
    private final String userLoginTime;
}
