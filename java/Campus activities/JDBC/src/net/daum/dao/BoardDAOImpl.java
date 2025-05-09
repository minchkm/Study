package net.daum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.daum.controller.BoardExample;
import net.daum.dto.BoardDTO;

public class BoardDAOImpl {   //오라클 연동 클래스
   
   String driver ="oracle.jdbc.OracleDriver";
   String url = "jdbc:oracle:thin:@localhost:1521:xe";
   String user = "night";
   String password = "night";
   
   Connection con = null; //db연결
   PreparedStatement pt = null; //쿼리문 수행
   ResultSet rs = null; //검색 결과 레코드를 저장할 rs
   String sql = null;
   
   BoardExample exitB = new BoardExample();
   
   public BoardDAOImpl() {
      try {
         Class.forName(driver);
      }catch(Exception e) {
         e.printStackTrace();
         exitB.exit();
      }
      
   }
   public List<BoardDTO> getBoardList() {
      List<BoardDTO> blist = new ArrayList<>();
      
      try {
         con = DriverManager.getConnection(url, user, password);
         sql = "select * from boards order by bno desc";
         pt = con.prepareStatement(sql);
         rs = pt.executeQuery();
         while(rs.next()) {
            
            BoardDTO b = new BoardDTO();
            b.setBno(rs.getInt(1));
            b.setBwriter(rs.getString("bwriter"));
            b.setBdate(rs.getDate("bdate"));
            b.setBtitle(rs.getString("btitle"));
            
            blist.add(b);
         }
         
         rs.close();
         pt.close();
      }catch(Exception e) {
         e.printStackTrace();
         exitB.exit();
      }finally {
         try {
            if(con != null) con.close();
         }catch(Exception e) {e.printStackTrace();}
      }
      return blist;
   }
   public void insertBoard(BoardDTO board) {
      try {
         con = DriverManager.getConnection(url, user, password);
         sql = "insert into boards (bno,bwriter,btitle,bcontent) values(seq_bno.nextval,?,?,?)";
         pt = con.prepareStatement(sql);
         pt.setString(1, board.getBwriter());
         pt.setString(2, board.getBtitle());
         pt.setString(3, board.getBcontent());
         pt.executeUpdate();
         
         pt.close();
      }catch(Exception e ) {
         e.printStackTrace();
         exitB.exit();
      }finally{
         try {
            if(con != null) con.close();
         }catch(Exception e) {e.printStackTrace();}
      }
   }// insertBoard()
   
public BoardDTO getFindNo(int bno) {
	BoardDTO findNo =null;
	try {
		con = DriverManager.getConnection(url,user,password);
		sql = "select bno from boards where bno =?";
		pt = con.prepareStatement(sql);
		pt.setInt(1, bno);
		rs = pt.executeQuery();
		
		if(rs.next()) {
			findNo = new BoardDTO();
			findNo.setBno(rs.getInt(bno));
			
		}
	     rs.close();
	     pt.close();
	     
	}catch(Exception e) {e.printStackTrace();
	   exitB.exit();
	}finally {
		try {
			if(con != null) con.close();
			
		}catch(Exception e) {e.printStackTrace();}
	}
	
	return findNo;
}
public BoardDTO getBoardCont(int bno) {
	BoardDTO bc =null;
	
	try {
		 con = DriverManager.getConnection(url,user,password);
		 sql = "select *from boards where bno=?";
		 pt = con.prepareStatement(sql);
			pt.setInt(1, bno);
			rs = pt.executeQuery();
			
			if(rs.next()) {
				bc = new BoardDTO();
				bc.setBno(rs.getInt(bno));
				bc.setBtitle(rs.getString("btilte"));
				bc.setBcontent(rs.getString("bcontent"));
				bc.setBdate(rs.getDate("bdate"));
				
			}
		     rs.close();
		     pt.close();
			
	}catch(Exception e ) {e.printStackTrace(); 
	exitB.exit();
	
	}finally {
		try {
			if(con != null) con.close();
		}catch(Exception e) {e.printStackTrace();}
	}
	
	
	return bc;
}
public void updateBoard(BoardDTO eb) {
	
    String sql = "UPDATE boards SET btitle=?, bcontent=?, bwriter=? WHERE bno=?";
    try (PreparedStatement pstmt = con.prepareStatement(sql)) {
        pstmt.setString(1, eb.getBtitle());
        pstmt.setString(2, eb.getBcontent());
        pstmt.setString(3, eb.getBwriter());
        pstmt.setInt(4, eb.getBno());
        pstmt.executeUpdate();
        
        pstmt.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
}     

   

}
