package interfacetest;

// interface
// 모든 멤버 변수는 public static final 이어야 함 (상수)
// 모든 멤버 메소드는 public abstract임 (abstract 생략 가능)
// 추상화가 높은 상태(기본 설계도)
// body를 가진 메소드는 static, default 만 가능(1.8 버전에서 추가됨)
// (자식클래스 입장에서) 여러 개 구현 가능
// public class Bonus extends(하나만 가능) Creditline implements(여러개 가능) Account, CheckingAccount, ...

public interface Account {
  // 에러 accountNo; only public, static & final
  // private String accountNo; 멤버변수 선언 불가

  public static final int SPADE = 4; // 상수만 가능함.

  // 에러 Abstract methods do not specify a body
  public void deposit(); // interface클래스에서 메소드는 바디{}를 가질 수 없음

  static void getCardKind() {} // 앞에 static, default가 붙으면 바디{} 가 들어올 수 있음

  default void getCard() {}
}
