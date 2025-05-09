package net.daum.controller;

import java.util.List;
import java.util.Scanner;

import net.daum.dao.BoardDAOImpl;
import net.daum.dto.BoardDTO;

public class BoardExample { //게시판

   private Scanner scan =  new Scanner(System.in);
   
   //게시판 목록
   public void list() {
      System.out.println();
      System.out.println("[게시판 목록]");
      System.out.println("------------------------");
      System.out.printf("%-6s%-12s%-16s%-40s\n","no","writer","date","title");
      /* %-6s는 문자열 출력형태 지정자이다.  -는 왼쪽 정렬, 6인 최소 출력 너비 6칸, %s는 문자열 출력형태 지시자이다. 
       * 결국 %-6s는 문자열을 왼쪽 정렬하고 전체 너비를 6칸으로 맞추라는 의미이다. 빈칸이 남으면 오른쪽에 공백이 들어간다.
       * 
       */
      System.out.println("------------------------");
      
      BoardDAOImpl bdao = new BoardDAOImpl();
      List<BoardDTO> blist = bdao.getBoardList();
      
      if(blist != null && blist.size() > 0) {
         for(BoardDTO b:blist) {
         System.out.printf("%-6s%-12s%-16s%-40s \n",b.getBno(),b.getBwriter(),b.getBdate(),b.getBtitle());
      }
   }else {
      System.out.println("게시판 목록이 없습니다.");
   }
       mainMenu();
   }
   public void mainMenu() {
      System.out.println();
      System.out.println("----------------------");
      System.out.println("메인 메뉴: 1.create| 2.Read | 3.Clear | 4.Exit ");
      System.out.println("메뉴 선택");
      String menuNo = scan.nextLine();
      System.out.println();
      
      switch(menuNo) {
      case "1" : create(); break;
      case "2" : read(); break;
      case "4" : exit(); break;
      }
   }
   //게시판 저장
   public void create() {
      BoardDTO board=new BoardDTO();
      System.out.println("[새 게시물 입력]");
      System.out.println("글쓴이>");
      board.setBwriter(scan.nextLine());
      System.out.print("글제목 >");
      board.setBtitle(scan.nextLine());
      System.out.print("글내용 >");
      board.setBcontent(scan.nextLine());
      
      System.out.println("------------------------");
      System.out.println("보조 메뉴 : 1.ok | 2.Cancel");
      System.out.print("메뉴 선택 >");
      String menuNo = scan.nextLine();
      
      if(menuNo.equals("1")) {
         BoardDAOImpl bdao = new BoardDAOImpl();
         bdao.insertBoard(board);
         list();
      }else {
         list();
      }
   }
   public void read() {
	   System.out.println("[게시물읽기]");
	  System.out.print("게시판 번호 입력:");
	  int bno = Integer.parseInt(scan.nextLine());
	  
	  BoardDAOImpl bdao = new BoardDAOImpl();
	  BoardDTO findBno = bdao.getFindNo(bno);
	  
	  if(findBno != null) {
		  BoardDTO bc = bdao.getBoardCont(bno);
		  
		  System.out.println("###################");
		  System.out.println("게시판 번호: "+bc.getBno());
		  System.out.println("글쓴이: "+bc.getBwriter());
		  System.out.println("글제목: "+bc.getBtitle());
		  System.out.println("글내용: "+bc.getBcontent());
		  System.out.println("등록날짜: "+bc.getBdate());
		  
		  // 보조메뉴 출력
		  System.out.println("------------------------");
		  System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
		  System.out.print("메뉴선택");
		  String menuNo = scan.nextLine();
		  
		  if(menuNo.equals("1")) {
			  update(bc);
			  
		  }else if(menuNo.equals("2")) {
			   delete(bc);
		  }else {
			  list();
		  }
	  }else {
		  System.out.println("해당 게시물 내용이 없습니다");
		  list();
	  }
   }
   
   private void update(BoardDTO eb) {
	   
	   System.out.println("[게시판 수정내용 입력]");
	   System.out.print("수정제목:");
	   eb.setBtitle(scan.nextLine());
	   System.out.print("수정내용");
	   eb.setBcontent(scan.nextLine());
	   System.out.print("수정 글쓴이");
	   eb.setBwriter(scan.nextLine());
	   
	   System.out.println("------------------------");
	   System.out.println("보조 메뉴 1.Ok | 2.Cancel");
	   System.out.print("메뉴 선택");
	   String menuNo = scan.nextLine();
	   
	   if(menuNo.equals("1")) {
		   BoardDAOImpl bdao = new BoardDAOImpl();
		   bdao.updateBoard(eb);
		   
		
        
		   list();
		   
	   }else {
		   list();
	   }
	   
}


   
   
   public void exit() {
      System.out.println("게시판 종료");
      System.exit(0);
   }

   public static void main(String[] args) {
      BoardExample boardEx = new BoardExample();
      boardEx.list();
      
      
      
   }

}
