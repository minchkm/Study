/* Scanner로 고객번호를 입력받아서 오라클로부터 검색한 후 해당 고객번호가 있는 경우만 고객번호를 기준으로 삭제되게 한다
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import net.daum.dao.CustomerDAOImpl;
import net.daum.dto.CustomerDTO;

public class Customer_Del01 {
	public static void main(String[] args) {
		 String driver = "oracle.jdbc.OracleDriver";
	        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // SID 확인 필수
	        String user = "night";
	        String pwd = "night";
 
	        Connection con = null;
	        PreparedStatement pstmt= null;
	        String sql = null;
	     
	        
	        CustomerDAOImpl cdao = new CustomerDAOImpl();
	        
	        try {
	        	Class.forName(driver);
	        	con = DriverManager.getConnection(url,user,pwd);
	        	Scanner scan = new Scanner(System.in);
	        	System.out.println("고객정보 삭제");
	        	System.out.println("고객번호 입력");
	        	int cus_no = Integer.parseInt(scan.nextLine());
	        	
	        	CustomerDTO cus_NO = cdao.getCusNo(cus_no); //오라클로부터 고객번호를 검색
	        	if(cus_NO != null) {
	        		sql  ="delete from customer where cus_no=?";
	        		pstmt = con.prepareStatement(sql);
	        		pstmt.setInt(1, cus_no);
	        		
	        		int re =pstmt.executeUpdate();
      	}else {
	        		System.out.println("번호 검색되지낳음");
	        	}
	        	
	        }catch(Exception e) {e.printStackTrace();}
	        finally {
		        try{
		        	if(pstmt != null)pstmt.close();
		        	if(con !=null) con.close();
		        }catch(Exception e) {e.printStackTrace();}
			}
		
	}

}
