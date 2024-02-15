package lang;

public class Member {

  String id;

  public Member(String id) {
    this.id = id;
  }

  // 값 비교로 equals 재정의
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member m = (Member) obj;
      if (this.id.equals(m.id)) {
        return true;
      }
    }
    return false;
  }

  @Override // 클래스의 주소지 확인 -> 멤버변수의 값 확인
  public String toString() {
    return "Member [id=" + id + "]";
  }
}
