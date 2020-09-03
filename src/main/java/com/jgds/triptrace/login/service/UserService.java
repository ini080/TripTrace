package com.jgds.triptrace.login.service;

import com.jgds.triptrace.login.vo.UserVO;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    List<UserVO> selectUserList() throws Exception;
}
