package net.daum.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter //seter() 메서드 자동생성 
@Getter //geter() 메서드 자동생성
public class BoardDTO {  //중간데이터 저장빈 클래스 -> 되도록 테이블 컬럼명과 일치하는 변수명 정의
	
	private int bno; //게시판 번호 
	private String bwriter; //글쓴이 
	private String btitle; //글제목
	private String bcontent; //글내용
	private Date bdate;   //등록날짜 
	
	
	
	
	
	

}
