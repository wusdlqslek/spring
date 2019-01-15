package com.myspring.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myspring.domain.BoardVO;
import com.myspring.domain.Criteria;
import com.myspring.domain.PageMaker;
import com.myspring.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Inject
	private BoardService service;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board_vo, Model model) throws Exception{
		logger.info("등록 get");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(BoardVO board_vo, RedirectAttributes rttr) throws Exception{
		logger.info("등록POST");
		logger.info(board_vo.toString());
		service.regist(board_vo);
		rttr.addFlashAttribute("msg","success");
		return "redirect:listAll";
	}
	
	@RequestMapping(value ="/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		logger.info("show all list");
		model.addAttribute("list", service.listAll());
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("board_bno") int board_bno, Model model)
		throws Exception{
		model.addAttribute(service.read(board_bno));
		System.out.println(service.toString());
		System.out.println(service.read(board_bno).toString());
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("board_bno") int board_bno, RedirectAttributes rttr) throws Exception{
		service.remove(board_bno);
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int board_bno, Model model) throws Exception{
		model.addAttribute(service.read(board_bno));
		System.out.println("수정할 게시물 상세" + service.read(board_bno).toString());
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO board_vo, RedirectAttributes rttr) throws Exception{
		logger.info("수정 post");
		logger.info(board_vo.toString());
		service.modify(board_vo);
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/listCri", method = RequestMethod.GET)
	public void listAll(Criteria cri, Model model) throws Exception{
		logger.info("show list page with criteria");
		model.addAttribute("list", service.listCriteria(cri));
	}
	
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public void listPage(Criteria cri, Model model) throws Exception{
		logger.info(cri.toString());
		model.addAttribute("list", service.listCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listCountCriteria(cri));
		model.addAttribute("pageMaker", pageMaker);
	}

	
}
