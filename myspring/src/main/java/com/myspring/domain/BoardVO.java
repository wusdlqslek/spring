package com.myspring.domain;

import java.util.Date;

public class BoardVO {

	private Integer board_bno;
	private String board_title;
	private String board_content;
	private String board_writer;
	private Date board_regdate;
	private int board_viewcnt;
	public Integer getBoard_bno() {
		return board_bno;
	}
	public void setBoard_bno(Integer board_bno) {
		this.board_bno = board_bno;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public Date getBoard_regdate() {
		return board_regdate;
	}
	public void setBoard_regdate(Date board_regdate) {
		this.board_regdate = board_regdate;
	}
	public int getBoard_viewcnt() {
		return board_viewcnt;
	}
	public void setBoard_viewcnt(int board_viewcnt) {
		this.board_viewcnt = board_viewcnt;
	}
	@Override
	public String toString() {
		return "BoardVO [board_bno=" + board_bno + ", board_title=" + board_title + ", board_content=" + board_content
				+ ", board_writer=" + board_writer + ", board_regdate=" + board_regdate + ", board_viewcnt="
				+ board_viewcnt + "]";
	}
	
	
	
}
