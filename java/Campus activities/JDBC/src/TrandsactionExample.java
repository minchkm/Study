import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 트랜잭션은 논리적 기능 처리의 최소 단위를 말한다.
 * 예를 들어 계좌 이체는 출금과 입금 작업으로 구성된 트랜잭션이다.
 * 출금과 입금 작업 중 하나만 성공할 수 없으며, 모두 성공하거나 모두 실패해야 한다.
 * 트랜잭션 처리는 커밋(commit)과 롤백(rollback)으로 처리 가능하다.
 * JDBC에서는 insert, update, delete 문을 실행할 때마다 자동 커밋이 일어난다.
 * 계좌 이체처럼 두 가지 update문이 동시에 실행될 때는 자동 커밋을 꺼야 한다.
 * 자동 커밋 설정 여부는 Connection의 setAutoCommit() 메서드로 할 수 있다.
 */

public class TrandsactionExample {
    public static void main(String[] args) {

        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // SID 확인 필수
        String user = "night";
        String pwd = "night";

        Connection con = null;
        PreparedStatement pstmt01 = null;
        PreparedStatement pstmt02 = null;
        String sql01 = null;
        String sql02 = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pwd);

            // 트랜잭션 시작
            con.setAutoCommit(false); // 자동 커밋 기능 끄기

            // 출금 작업
            sql01 = "update accounts set balance = balance - ? where ano = ?";
            pstmt01 = con.prepareStatement(sql01);
            pstmt01.setInt(1, 10000); // 쿼리문의 첫 번째 물음표에 출금액 10000을 정수 숫자로 저장
            pstmt01.setString(2, "123-111-1111"); // 쿼리문의 두 번째 물음표에 계좌번호를 저장
            int re01 = pstmt01.executeUpdate(); // 수정 쿼리문 수행, 성공한 레코드 행의 개수 반환

            if (re01 == 0) {
                throw new Exception("출금 실패");
            }
            pstmt01.close();

            // 입금 작업
            sql02 = "update accounts set balance = balance + ? where ano = ?";
            pstmt02 = con.prepareStatement(sql02);
            pstmt02.setInt(1, 10000);
            pstmt02.setString(2, "222-222-2222");
            int re02 = pstmt02.executeUpdate();

            if (re02 == 0)
                throw new Exception("입금 실패");
            pstmt02.close();

            con.commit();
            System.out.println("계좌 이체 성공");

        } catch (Exception e) {
            try {
                if (con != null) con.rollback(); // 수동 롤백처리 -> 입출금 모두 실패처리
            } catch (Exception e1) { }
            System.out.println("계좌 이체 실패");
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.setAutoCommit(true); // 원래대로 자동 커밋 기능 켜기
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
