package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.domain.BoardEntity;
import com.example.domain.QBoardEntity;
import com.querydsl.jpa.impl.JPAQuery;


@Repository
public class BoardRepository{
	//EntityManager가 DI할 수 있도록 어노테이션 설정 
	@PersistenceContext
	private EntityManager em;
	
	private final QBoardEntity qBoardEntity = QBoardEntity.boardEntity;
	
	
//	public List<BoardEntity> findAll(){
//		//jpql java와 매핑 
//		//jpql
//		String jpql = "SELECT tbp FROM BoardEntity tbp ORDER BY tbp.writeDate DESC";
//		TypedQuery<BoardEntity> query = em.createQuery(jpql, BoardEntity.class);
//		return query.getResultList();
//	}
	
	public List<BoardEntity> findAll(){
		JPAQuery query = new JPAQuery(em);
		//QBoardEntity qBoardEntity = new QBoardEntity("boardentity");
		//QBoardEntity qBoard = QBoardEntity.qBoard;
		List<BoardEntity> boardList = query.from(qBoardEntity).fetch();
		return boardList;
	}
}
