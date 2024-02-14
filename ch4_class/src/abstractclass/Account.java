package abstractclass;

// 추상 클래스
// 미완성 설계도 => 자식 클래스에서 완성
// 추상 메소드
// 인스턴스 생성 불가능 = new 불가능

// 클래스 : 완성 설계도
//
public abstract class Account {

  // 멤버 변수
  private String accountNo;

  // 멤버 메소드
  public void deposit() {}

  // 생성자
  public Account() {}

  public Account(String accountNo) {
    this.accountNo = accountNo;
  }

  //추상 메소드 => {} 없음
  public abstract void print();
}
