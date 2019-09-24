package com.example.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardEntity is a Querydsl query type for BoardEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBoardEntity extends EntityPathBase<BoardEntity> {

    private static final long serialVersionUID = -1969626192L;

    public static final QBoardEntity boardEntity = new QBoardEntity("boardEntity");

    public final StringPath content = createString("content");

    public final StringPath name = createString("name");

    public final NumberPath<Long> num = createNumber("num", Long.class);

    public final NumberPath<Long> readCount = createNumber("readCount", Long.class);

    public final StringPath title = createString("title");

    public final DatePath<java.util.Date> writeDate = createDate("writeDate", java.util.Date.class);

    public QBoardEntity(String variable) {
        super(BoardEntity.class, forVariable(variable));
    }

    public QBoardEntity(Path<? extends BoardEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardEntity(PathMetadata metadata) {
        super(BoardEntity.class, metadata);
    }

}

