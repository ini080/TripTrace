package com.jgds.triptrace.main.service;

import com.jgds.triptrace.main.vo.BoardVO;
import com.jgds.triptrace.main.vo.FileVO;

import java.util.List;

public interface BoardService {

    List<BoardVO> selectBoardList(BoardVO boardVO) throws Exception;

    BoardVO selectBoard(BoardVO boardVO);

    FileVO selectThumbNailInfo(BoardVO boardVO);

    int insertBoard(BoardVO boardVO) throws Exception;

    int insertAttachFile(FileVO fileVO) throws Exception;

}
