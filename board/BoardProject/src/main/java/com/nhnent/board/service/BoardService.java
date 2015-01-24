package com.nhnent.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhnent.board.dao.BoardDao;
import com.nhnent.board.model.Board;

@Service
public class BoardService {
	@Autowired
	BoardDao boardDao;
	
	public void insertBoard(Board board){
		boardDao.insertBoard(board);
	}
	public List<Board> getBoardList() {
		return boardDao.getBoardList();
	}
}
