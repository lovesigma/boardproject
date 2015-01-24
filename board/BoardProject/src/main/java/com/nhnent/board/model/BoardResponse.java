package com.nhnent.board.model;

import java.util.List;

public class BoardResponse {
	String result;
	List<Board> boards;
	
	public BoardResponse(String result, List<Board> boards) {
		this.result = result;
		this.boards = boards;
	}
}
