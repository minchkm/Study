import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc_03 {
	public static void main(String[] args) {

		
		 String driver = "oracle.jdbc.OracleDriver";
	        String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	        String user = "night";
	        String password = "night";

	        Connection con = null;
	        PreparedStatement pt = null;
	        String sql = null;
	        Scanner scan = null;

	        try {
	            Class.forName(driver);
	            con = DriverManager.getConnection(url, user, password);
	            scan = new Scanner(System.in);

	            System.out.println("#### 고객 정보 입력 ####");
	            System.out.print("작성자: ");
	            String cus_bname = scan.nextLine();
	            System.out.print("제목: ");
	            String cus_btitle = scan.nextLine();
	            System.out.print("내용: ");
	            String cus_bcont = scan.nextLine();

	            // SQL 문법 오류 수정 (+ 제거)
	            sql = "INSERT INTO tbl_board7 (bno, bname, btitle, bcont, bdate) "
	                + "VALUES (bno_seq2.nextval, ?, ?, ?, sysdate)";

	            pt = con.prepareStatement(sql);
	            pt.setString(1, cus_bname);
	            pt.setString(2, cus_btitle);
	            pt.setString(3, cus_bcont);

	            int re = pt.executeUpdate();
	            System.out.println(re == 1 ? "저장 성공" : "저장 실패");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (pt != null) pt.close();
	                if (con != null) con.close();
	                if (scan != null) scan.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    } 
	} 


