package account;

// 은행 : Account
// 은행 + 체크카드 : Checking Account
// 은행 + 체크카드 + 교통카드 : CheckingTrafficCardAccount
// 은행 + 마이너스 통장

public class CreditLineAccount extends Account {

  private int creditLine;

  public CreditLineAccount(
    String accountNO,
    String owner,
    int balance,
    int creditLine
  ) {
    super(accountNO, owner, balance);
    this.creditLine = creditLine;
  }

  @Override // 잔액 = 잔액 + 마이너스 한도
  public void withdraw(int amount) throws Exception {
    if (getBalance() + creditLine < amount) {
      throw new Exception("인출 불가");
    }
    super.setBalance(getBalance() + creditLine);
    super.withdraw(amount);
  }
}
