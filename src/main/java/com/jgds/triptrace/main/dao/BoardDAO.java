package com.jgds.triptrace.main.dao;

import com.jgds.triptrace.main.vo.BoardVO;
import com.jgds.triptrace.main.vo.FileVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoardDAO {
    List<BoardVO> selectBoardList(BoardVO boardVO);
    BoardVO selectBoard(BoardVO boardVO);
    FileVO selectThumbNailInfo(BoardVO boardVO);
    int insertBoard(BoardVO boardVO);
    int insertAttachFile(FileVO fileVO);
}
