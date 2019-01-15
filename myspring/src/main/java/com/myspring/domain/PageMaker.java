package com.myspring.domain;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {
	
	private int totalCount;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	

	
	private int displayPageNum = 10;
	private Criteria cri;
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	
	public String makeQuery(int board_page) {
		UriComponents uriComponents = UriComponentsBuilder.newInstance().queryParam
									("board_page",board_page).queryParam("perPageNum", cri.getPerPageNum()).build();
				return uriComponents.toUriString();
	}
	
	private void calcData() {
		endPage = (int)(Math.ceil(cri.getBoard_page() / 
						(double) displayPageNum) * displayPageNum);
		startPage = (endPage - displayPageNum) + 1;
		int tempEndPage = (int)(Math.ceil(totalCount / 
				(double)cri.getPerPageNum()));
		if(endPage>tempEndPage) {
			endPage = tempEndPage;
		}
		prev = startPage == 1 ? false : true;
		next = endPage * cri.getPerPageNum() >= totalCount ? false : true;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}

	public Criteria getCri() {
		return cri;
	}

	@Override
	public String toString() {
		return "PageMaker [totalCount=" + totalCount + ", startPage=" + startPage + ", endPage=" + endPage + ", prev="
				+ prev + ", next=" + next + ", displayPageNum=" + displayPageNum + ", cri=" + cri + "]";
	}
	
	
	
}
