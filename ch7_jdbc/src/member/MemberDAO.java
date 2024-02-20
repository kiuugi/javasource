package member;

import static member.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 메소드작성
// 1) 실행할 sql 구문 작성
// - insert, update, delete => int
// - select // List에 담을거냐 안담냐 차이
//   1) 결과 값 하나라면 : excuteQuery() => ~~DTO
//   1) 결과 값 여러개 라면 => List<~~DTO>

public class MemberDAO {

  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;

  public int insert(MemberDTO dto) {
    int result = 0;
    String sql = "INSERT INTO  MEMBERTBL (userid, password, name, email)";
    sql += "VALUES(?, ?, ?, ?)";
    con = getConnection();
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, dto.getUserId());
      pstmt.setString(2, dto.getPassword());
      pstmt.setString(3, dto.getName());
      pstmt.setString(4, dto.getEmail());
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }

  public MemberDTO getRow(String userId, String password) {
    con = getConnection();
    // 개별 회원 조회
    String sql = "SELECT * FROM MEMBERTBL WHERE userId = ? AND PASSWORD = ?";

    MemberDTO memberDTO = null;

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, userId); // java.sql.SQLException: ORA-17003: 열 인덱스가 부적합합니다. : ? 쪽 잘못됨
      pstmt.setString(2, password);
      rs = pstmt.executeQuery();
      if (rs.next()) {
        memberDTO = new MemberDTO();
        memberDTO.setUserId(rs.getString("userid"));
        memberDTO.setPassword(rs.getString("password"));
        memberDTO.setName(rs.getString("name"));
        memberDTO.setEmail(rs.getString("email"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return memberDTO;
  }

  // public MemberDTO getRow(MemberDTO dto) {
  //   con = getConnection();
  //   // 개별 회원 조회
  //   String sql = "SELECT * FROM MEMBERTBL WHERE userId = ? AND PASSWORD = ?";

  //   MemberDTO memberDTO = null;

  //   try {
  //     pstmt = con.prepareStatement(sql);
  //     pstmt.setString(1, dto.getUserId());
  //     pstmt.setString(2, dto.getPassword());
  //     rs = pstmt.executeQuery();
  //     if (rs.next()) {
  //       memberDTO = new MemberDTO();
  //       memberDTO.setUserId(rs.getString("userid"));
  //       memberDTO.setPassword(rs.getString("password"));
  //       memberDTO.setName(rs.getString("name"));
  //       memberDTO.setEmail(rs.getString("email"));
  //     }
  //   } catch (SQLException e) {
  //     e.printStackTrace();
  //   } finally {
  //     close(con, pstmt, rs);
  //   }
  //   return memberDTO;
  // }

  public List<MemberDTO> getRows() {
    // 전체 회원 조회
    con = getConnection();
    String sql = "SELECT * FROM MEMBERTBL"; // java.sql.SQLSyntaxErrorException: ORA-00933: SQL 명령어가 올바르게 종료되지 않았습니다.
    List<MemberDTO> list = new ArrayList<>();

    try {
      pstmt = con.prepareStatement(sql); //보내기 sql 문에 ? 가 없어서 그걸 채워주는 문구가 없음
      rs = pstmt.executeQuery(); // 실행
      while (rs.next()) {
        MemberDTO mDto = new MemberDTO();
        mDto.setUserId(rs.getString("userid")); // 칼럼명
        mDto.setPassword(rs.getString("password"));
        mDto.setName(rs.getString("name"));
        mDto.setEmail(rs.getString("email"));

        list.add(mDto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return list;
  }

  public int update(String userId, String password) {
    int result = 0;
    con = getConnection();
    String sql = "UPDATE MEMBERTBL SET PASSWORD = ? WHERE USERID = ?";
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, password);
      pstmt.setString(2, userId);
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }

  public int delete(String userId) {
    int result = 0;
    con = getConnection();
    String sql = "DELETE FROM MEMBERTBL WHERE USERID = ?";
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, userId);
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }
}
