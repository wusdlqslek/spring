package com.myspring.service;

import java.util.List;

import com.myspring.domain.BoardVO;
import com.myspring.domain.Criteria;

public interface BoardService {

	public void regist(BoardVO board_vo) throws Exception;
	public BoardVO read(Integer board_bno) throws Exception;
	public void modify(BoardVO board_vo) throws Exception;
	public void remove(Integer board_bno) throws Exception;
	public List<BoardVO> listAll() throws Exception;
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	public int listCountCriteria(Criteria cri) throws Exception;
	
}
