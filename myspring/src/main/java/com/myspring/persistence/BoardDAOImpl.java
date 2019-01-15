package com.myspring.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.myspring.domain.BoardVO;
import com.myspring.domain.Criteria;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.myspring.mappers.boardMapper";

	@Override
	public void create(BoardVO board_vo) throws Exception {
		session.insert(namespace+".create", board_vo);
		
	}

	@Override
	public BoardVO read(Integer board_bno) throws Exception {
		
		return session.selectOne(namespace+".read", board_bno);
	}

	@Override
	public void update(BoardVO board_vo) throws Exception {
		
		session.update(namespace+".update", board_vo);
		
	}

	@Override
	public void delete(Integer board_bno) throws Exception {
		
		session.delete(namespace+".delete",board_bno);
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".listAll");
	}
	
	@Override
	public List<BoardVO> listPage(int board_page) throws Exception{
		if (board_page <= 0) {
			board_page = 1;
			System.out.println("if 들어감");
		}
		System.out.println(board_page);
		board_page = (board_page - 1) * 10;
		System.out.println(board_page + " 변했을 때");
		return session.selectList(namespace + ".listPage", board_page);
	}
	
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception{
		return session.selectList(namespace +".listCriteria", cri);
	}
	
	@Override
	public int countPaging(Criteria cri) throws Exception{
		return session.selectOne(namespace +".countPaging", cri);
	}
	
}
