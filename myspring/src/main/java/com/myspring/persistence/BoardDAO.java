package com.myspring.persistence;

import java.util.List;

import com.myspring.domain.BoardVO;
import com.myspring.domain.Criteria;

public interface BoardDAO {

	public void create(BoardVO board_vo) throws Exception;
	public BoardVO read(Integer board_bno) throws Exception;
	public void update(BoardVO board_vo) throws Exception;
	public void delete(Integer board_bno) throws Exception;
	public List<BoardVO>listAll() throws Exception;
	public List<BoardVO>listPage(int board_page) throws Exception;
	public List<BoardVO>listCriteria(Criteria cri) throws Exception;
	public int countPaging(Criteria cri)throws Exception;
	
}
