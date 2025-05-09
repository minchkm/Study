import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Customer_select01 {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // SID 확인
        String user = "night";
        String password = "night";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();

            // SQL 오류 수정 (order by, cus_no)
            String sql = "SELECT * FROM customer ORDER BY cus_no DESC";
            rs = stmt.executeQuery(sql); // executeQuery() 사용

            System.out.println("■■■■■■■■■■ 고객 목록 ■■■■■■■■■■");
            System.out.println("번호\t이름\t전화번호\t\t이메일\t\t등록일");
            System.out.println("----------------------------------------------------------");

            while (rs.next()) {
                int cus_no = rs.getInt("cus_no");
                String cus_name = rs.getString("cus_name");
                String cus_phone = rs.getString("cus_phone");
                String cus_email = rs.getString("cus_email");
                String cus_date = rs.getString("cus_date");

                System.out.printf(
                    "%d\t%s\t%s\t%s\t%s\n",
                    cus_no, cus_name, cus_phone, cus_email, cus_date
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
