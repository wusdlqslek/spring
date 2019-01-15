package com.myspring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.myspring.domain.BoardVO;
import com.myspring.domain.Criteria;
import com.myspring.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public void regist(BoardVO board_vo) throws Exception {
		dao.create(board_vo);
	}

	@Override
	public BoardVO read(Integer board_bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(board_bno);
	}

	@Override
	public void modify(BoardVO board_vo) throws Exception {
		dao.update(board_vo);
		
	}

	@Override
	public void remove(Integer board_bno) throws Exception {
		dao.delete(board_bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listCriteria(cri);
	}
	
	@Override
	public int listCountCriteria(Criteria cri) throws Exception{
		return dao.countPaging(cri);
	}
}
