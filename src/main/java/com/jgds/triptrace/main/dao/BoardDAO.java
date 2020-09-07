package com.jgds.triptrace.main.dao;

import com.jgds.triptrace.main.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BoardDAO {
    int insertBoard(BoardVO boardVO);
}
