package com.myspring.domain;

public class Criteria {

	private int board_page;
	private int perPageNum;
	
	public Criteria() {
		this.board_page = 1;
		this.perPageNum = 10;
	}
	@Override
	public String toString() {
		return "Criteria [board_page=" + board_page + ", perPageNum=" + perPageNum + "]";
	}
	
	public int getBoard_page() {
		return board_page;
	}
	
	public void setBoard_page(int board_page) {
		if(board_page <= 0) {
			this.board_page = 1;
			return;
		}
		this.board_page = board_page;
	}
	
	public int getPerPageNum() {
		return perPageNum;
	}
	
	public void setPerPageNum(int perPageNum) {
		
		if(perPageNum <= 0 || perPageNum > 100) {
			this.perPageNum = 10;
			return;
		}
		this.perPageNum = perPageNum;
	}
	
	public int getPageStart() {
		return(this.board_page - 1) * perPageNum;
	}
}
