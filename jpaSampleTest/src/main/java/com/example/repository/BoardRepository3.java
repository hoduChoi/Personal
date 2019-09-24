package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.BoardEntity;

public interface BoardRepository3 extends JpaRepository<BoardEntity, Long>{
	//메서드 이름으로 쿼리 생성 가능 
	List<BoardEntity> findAll();
}
