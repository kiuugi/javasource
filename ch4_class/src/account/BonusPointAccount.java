package account;

// 은행 : Account
// 은행 + 체크카드 : Checking Account
// 은행 + 체크카드 + 교통카드 : CheckingTrafficCardAccount
// 은행 + 마이너스 통장
// 은행 + 예금을 할때마다 보너스 포인트 (예금액의 0.01%)

public class BonusPointAccount extends Account {

  private int point;

  public BonusPointAccount(
    String accountNO,
    String owner,
    int balance,
    int point
  ) {
    super(accountNO, owner, balance);
    this.point = point;
  }

  public int getPoint() {
    return point;
  }

  @Override
  public void deposit(int amount) {
    point += (int) (amount * 0.01);
    super.deposit(amount);
  }
}
