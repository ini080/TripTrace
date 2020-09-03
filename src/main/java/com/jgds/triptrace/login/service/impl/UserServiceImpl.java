package com.jgds.triptrace.login.service.impl;

import com.jgds.triptrace.login.dao.LoginDAO;
import com.jgds.triptrace.login.service.UserService;
import com.jgds.triptrace.login.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private LoginDAO loginDAO;

    @Override
    public List<UserVO> selectUserList() throws Exception {
        return loginDAO.selectUserList();
    }
}
