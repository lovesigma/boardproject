package com.nhnent.board.model;

public class Board {
	String title;
	String creator;
	String content;
	public Board(){
		
	}
	public Board(String title,String creator,String content) {
		this.title = title;
		this.creator = creator;
		this.content = content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public String getCreator() {
		return creator;
	}
	public String getTitle() {
		return title;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}public void setTitle(String title) {
		this.title = title;
	}
}
