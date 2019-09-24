package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.BoardEntity;
import com.example.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService; 
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model) {
		List<BoardEntity> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		return "main";
	}
//	
//	@RequestMapping(value="/add", method=RequestMethod.POST)
//	public String add(BoardEntity boardEntity) {
//	//	boardService.insertMessage(guestbook);
//		return "redirect:/";
//	}
}
