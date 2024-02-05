package exam;

public class MemberEx {

  public static void main(String[] args) {
    // 회원 객체 생성 ==> 생성자 호출
    // id, password, name을 필수 기입,
    // id, password, name, age, job

    // grade, point => 마트 규칙에 따라 변경
    Member member1 = new Member("member1", "member1", "홍길동");
    Member member2 = new Member("member2", "member2", "이춘향", 30, "회사원");
    // Member member3 = new Member()
  }
}
