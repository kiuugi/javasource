package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
  static {
    // 드라이버 로드
    try {
      Class.forName("oracle.jdbc.OracleDriver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;

  public static Connection getConnection() {
    Connection con = null;
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "C##test2";
    String password = "test";

    try {
      con = DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return con;
  }

  public static void close(Connection con, PreparedStatement pstmt) {
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

  public static void close(
    Connection con,
    PreparedStatement pstmt,
    ResultSet rs
  ) {
    try {
      if (rs != null) {
        rs.close();
      }
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
