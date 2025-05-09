import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import net.daum.dao.CustomerDAOImpl;
import net.daum.dto.CustomerDTO;

/**
 * 저장 프로세스(Stored Procedure)를 호출하여
 * 고객 정보를 조회하고 출력하는 예제 프로그램
 */
public class CustomerPorExample {
    public static void main(String[] args) {
        // 오라클 DB 연결 정보
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        String user = "night";
        String pwd = "night";

        // DAO 객체 생성
        CustomerDAOImpl cdao = new CustomerDAOImpl();
        // 사용자 입력을 위한 Scanner
        Scanner scan = new Scanner(System.in);
        Connection con = null;
        CallableStatement ct = null;
        String sql = null;

        try {
            // JDBC 드라이버 로드
            Class.forName(driver);
            // DB 연결
            con = DriverManager.getConnection(url, user, pwd);

            System.out.println("저장 프로세스 수행 실습");
            System.out.println("고객 번호 입력");

            // 사용자로부터 고객번호 입력받기
            int cus_no = Integer.parseInt(scan.nextLine());

            // 입력받은 고객번호로 고객 정보 조회
            CustomerDTO cusNo = cdao.getCusNo(cus_no);

            // 고객 정보가 없으면 안내 메시지 출력
            if (cusNo == null) {
                System.out.println("고객번호가 없어서 수행불가");
            } else {
                // 저장 프로시저 호출 준비
                // 프로시저 customer_pro(?, ?, ?, ?) 호출
                sql = "{call customer_pro(?,?,?,?)}";
                ct = con.prepareCall(sql);

                // OUT 파라미터 등록 (1~3번), IN 파라미터(4번)에 고객번호 설정
                ct.registerOutParameter(1, java.sql.Types.VARCHAR); // 고객이름
                ct.registerOutParameter(2, java.sql.Types.VARCHAR); // 고객폰번호
                ct.registerOutParameter(3, java.sql.Types.VARCHAR); // 고객이메일
                ct.setInt(4, cus_no); // IN 파라미터(고객번호)

                // 프로시저 실행
                ct.execute();

                // 결과 출력
                System.out.println("고객번호\t고객이름\t고객폰번호\t고객이메일");
                System.out.println("=======================================");
                System.out.println(
                    cus_no + "\t" +
                    ct.getString(1) + "\t" +
                    ct.getString(2) + "\t" +
                    ct.getString(3)
                );
            }
        } catch (Exception e) {
            // 예외 발생 시 에러 메시지 출력
            e.printStackTrace();
        } finally {
            // 사용한 리소스 정리(닫기)
            try {
                if (ct != null) ct.close();
                if (con != null) con.close();
                if (scan != null) scan.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
