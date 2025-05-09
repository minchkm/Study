package net.daum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.daum.dto.CustomerDTO;

/**
 * 오라클 DB와 연결하여 고객 정보를 조회하는 DAO 클래스
 */
public class CustomerDAOImpl {

    // 오라클 JDBC 드라이버 클래스명
    String driver = "oracle.jdbc.driver.OracleDriver";
    // 오라클 접속 URL
    String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
    // 오라클 사용자명
    String user = "night";
    // 오라클 비밀번호
    String pwd = "night";

    /**
     * 생성자: JDBC 드라이버를 메모리에 로드
     */
    public CustomerDAOImpl() {
        try {
            Class.forName(driver); // JDBC 드라이버 로드
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 고객번호로 고객 정보를 조회하여 CustomerDTO에 저장해서 반환
     * @param cus_no 조회할 고객번호
     * @return CustomerDTO 객체(고객 정보), 없으면 null
     */
    public CustomerDTO getCusNo(int cus_no) {
        CustomerDTO cus_No = null; // 반환할 DTO 객체
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = null;

        try {
            // DB 연결
            con = DriverManager.getConnection(url, user, pwd);

            // 고객번호로 고객 정보 조회 SQL
            sql = "select cus_no, cus_name, cus_phone, cus_email, cus_date from customer where cus_no = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, cus_no); // 첫 번째 ?에 고객번호 바인딩

            rs = pstmt.executeQuery(); // 쿼리 실행

            // 결과가 있으면 DTO에 데이터 저장
            if (rs.next()) {
                cus_No = new CustomerDTO();
                cus_No.setCus_no(rs.getInt("cus_no"));
                cus_No.setCus_name(rs.getString("cus_name"));
                cus_No.setCus_phone(rs.getString("cus_phone"));
                cus_No.setCus_email(rs.getString("cus_email"));
                cus_No.setCus_date(rs.getString("cus_date"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 사용한 리소스 정리(닫기)
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cus_No; // 조회 결과 반환
    }
}
