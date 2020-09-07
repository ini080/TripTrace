package com.jgds.triptrace.main.service.impl;

import com.jgds.triptrace.main.dao.BoardDAO;
import com.jgds.triptrace.main.service.BoardService;
import com.jgds.triptrace.main.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO boardDAO;

    @Override
    public int insertBoard(BoardVO boardVO) throws Exception {
        System.out.println(boardVO.toString());
        return boardDAO.insertBoard(boardVO);
    }
}
