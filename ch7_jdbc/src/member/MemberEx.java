package member;

public class MemberEx {

  public static void main(String[] args) {
    Member m = new Member();
    m.toString();
    Member m1 = new Member(null, null, null);
    m.equals(m1);
    m1.setPassword(null);
  }
}
