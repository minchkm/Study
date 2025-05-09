

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Customer_Insert01 {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // SID 확인 필수
        String user = "night";
        String password = "night";

        Connection con = null;
        PreparedStatement pt = null;
        String sql = null;
        Scanner scan = null;
        
        System.out.println("#### 전화번호 부 메뉴 ####");
        System.out.println("1.연락처 추가 ");
        System.out.println("2.연락처 보기 ");
        System.out.println("3.연락처 수정 ");
        System.out.println("4.연락처 삭제 ");
        System.out.println("5.종료 ");
        scan = new Scanner(System.in);
       int menuNum = Integer.parseInt(scan.nextLine());
       
       if(menuNum == 5) {
    	   System.out.println("시스템이 종료되었습니다");
    	   System.exit(0);
       }else if(menuNum >5) {
    	   System.out.println("메뉴의 번호만 눌러주세요");
       }
       
       if(menuNum ==1) {
    	   

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            scan = new Scanner(System.in);
            
            
            System.out.println("이름: ");
            String cus_name = scan.nextLine();
            System.out.print("전화번호: ");
            String cus_phone = scan.nextLine();
            System.out.print("이메일: ");
            String cus_email = scan.nextLine();
            
          

            // SQL 문법 오류 수정 (+ 제거)
            sql = "INSERT INTO customer (cus_no, cus_name, cus_phone, cus_email, cus_date) "
                + "VALUES (cus_seq.nextval, ?, ?, ?, sysdate)";

            pt = con.prepareStatement(sql);
            pt.setString(1, cus_name);
            pt.setString(2, cus_phone);
            pt.setString(3, cus_email);

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
    } // main 메서드 닫힘
} // 클래스 닫힘
