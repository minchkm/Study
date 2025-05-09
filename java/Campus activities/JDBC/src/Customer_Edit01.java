import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Customer_Edit01 {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "night";
        String password = "night";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Scanner scan = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            scan = new Scanner(System.in);

            System.out.print("수정할 고객번호 입력: ");
            int cus_no = Integer.parseInt(scan.nextLine());

            String sql = "SELECT cus_no FROM customer WHERE cus_no = " + cus_no;
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                // 고객이 존재할 때
                System.out.print("수정할 고객이름 입력: ");
                String cus_name = scan.nextLine();
                System.out.print("수정할 폰번호 입력: ");
                String cus_phone = scan.nextLine();
                System.out.print("수정할 이메일 입력: ");
                String cus_email = scan.nextLine();

                sql = "UPDATE customer SET "
                        + "cus_name = '" + cus_name + "', "
                        + "cus_phone = '" + cus_phone + "', "
                        + "cus_email = '" + cus_email + "' "
                        + "WHERE cus_no = " + cus_no;

                int re = stmt.executeUpdate(sql);

                if (re == 1) {
                    System.out.println("수정 완료!");
                } else {
                    System.out.println("수정 실패!");
                }
            } else {
                // 고객번호가 없을 때
                System.out.println("해당 고객번호가 존재하지 않습니다. 수정 불가!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
                if (scan != null) scan.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
