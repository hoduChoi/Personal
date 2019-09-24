package com.example.domain;

import java.util.Date;

import javax.persistence.*;

//@ApiModel(value="Board", description="Board Model") //ui에서 체크를 할 수가 없음.
@Entity
@Table(name="TB_BOARD_TEMP")
public class BoardEntity{
//	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="NUM")
	private Long num;
	@Column(name="NAME")
    private String name;
	@Column(name="TITLE")
    private String title;
	@Column(name="CONTENT")
    private String content;
	@Column(name="READ_COUNT")
    private Long readCount;
	@Temporal(TemporalType.DATE)
	@Column(name="WRITE_DATE")
    private Date writeDate;
	
    public Long getNum() {
		return num;
	}
    
	public void setNum(Long num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getReadCount() {
		return readCount;
	}
	public void setReadCount(Long readCount) {
		this.readCount = readCount;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
 
}
