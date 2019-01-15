package com.myspring.org;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myspring.domain.BoardVO;
import com.myspring.domain.Criteria;
import com.myspring.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class BoardDAOTest {

	@Inject
	private BoardDAO dao;
	private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
/*	@Test
	public void testCreate() throws Exception{
		
		BoardVO board_vo = new BoardVO();
		board_vo.setBoard_title("22일글");
		board_vo.setBoard_content("22일글");
		board_vo.setBoard_writer("22일글");
		dao.create(board_vo);
	}*/
	
/*	@Test
	public void testRead() throws Exception{
		logger.info(dao.read(15).toString());
	}*/
	
/*	@Test
	public void testUpdate() throws Exception{
		BoardVO board_vo = new BoardVO();
		board_vo.setBoard_bno(14);
		board_vo.setBoard_title("22일 수정테스트");
		board_vo.setBoard_content("22일수정");
		dao.update(board_vo);
	}*/
	
/* @Test
	public void testDelete() throws Exception{
		
		dao.delete(18);
		dao.delete(19);
		dao.delete(20);
		dao.delete(21);
		dao.delete(22);
	}*/

	/*@Test
	public void testListPage() throws Exception{
		int board_page = 3;
		List<BoardVO> list = dao.listPage(board_page);
		for(BoardVO board_vo : list) {
			logger.info(board_vo.getBoard_bno() + ":" + board_vo.getBoard_title());
		}
	}*/

	@Test
	public void testListCriteria()throws Exception{
		Criteria cri = new Criteria();
		cri.setBoard_page(2);
		cri.setPerPageNum(20);
		List<BoardVO> list = dao.listCriteria(cri);
		for(BoardVO board_vo : list) {
			logger.info(board_vo.getBoard_bno() + ":" + board_vo.getBoard_title());;
		}
	}
}
