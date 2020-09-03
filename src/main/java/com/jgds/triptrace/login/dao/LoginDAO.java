package com.jgds.triptrace.login.dao;

import com.jgds.triptrace.login.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LoginDAO {
    List<UserVO> selectUserList();
}
