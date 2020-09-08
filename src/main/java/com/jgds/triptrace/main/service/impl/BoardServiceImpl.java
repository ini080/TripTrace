package com.jgds.triptrace.main.service.impl;

import com.jgds.triptrace.main.dao.BoardDAO;
import com.jgds.triptrace.main.service.BoardService;
import com.jgds.triptrace.main.vo.BoardVO;
import com.jgds.triptrace.main.vo.FileVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO boardDAO;

    @Override
    public List<BoardVO> selectBoardList(BoardVO boardVO) throws Exception {
        return boardDAO.selectBoardList(boardVO);
    }

    @Override
    public BoardVO selectBoard(BoardVO boardVO) {
        return boardDAO.selectBoard(boardVO);
    }

    @Override
    public FileVO selectThumbNailInfo(BoardVO boardVO) {
        return boardDAO.selectThumbNailInfo(boardVO);
    }

    @Override
    public int insertBoard(BoardVO boardVO) throws Exception {
        System.out.println(boardVO.toString());
        return boardDAO.insertBoard(boardVO);
    }

    @Override
    public int insertAttachFile(FileVO fileVO) throws Exception {
        return boardDAO.insertAttachFile(fileVO);
    }
}
