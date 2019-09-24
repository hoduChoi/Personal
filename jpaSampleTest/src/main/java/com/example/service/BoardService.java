package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.BoardEntity;
import com.example.repository.BoardRepository;
import com.example.repository.BoardRepository3;

@Service
public class BoardService {
	
	//repository 
	@Autowired
	BoardRepository3 boardRepository;
	
	public List<BoardEntity> getBoardList(){
		return boardRepository.findAll();
	}
	
//	public void insertData() {
//		
//	}
}
