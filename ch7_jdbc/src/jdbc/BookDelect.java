package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookDelect {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      // 1. 드라이버 로드
      Class.forName("oracle.jdbc.OracleDriver"); // 오라클 드라이버는 이 이름을 써야함 정해져있음

      // 2. 커넥션 얻기(위치,유져,비번,겟커넥션)
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "C##test2";
      String password = "test";

      con = DriverManager.getConnection(url, user, password);

      // 전송할 sql 문을 담음
      String sql = "DELETE FROM BOOKTBL WHERE CODE = 1004";

      // sql 문 전송
      pstmt = con.prepareStatement(sql);

      int result = pstmt.executeUpdate();

      if (result > 0) {
        System.out.println("삭제 성공");
      } else {
        System.out.println("삭제 실패");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (pstmt != null) {
          pstmt.close();
        }
        if (con != null) {
          con.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
