package exam;

public class Account {

  // 계좌번호(110-12-12345), 계좌주 이름, 잔액
  private String accountNum;
  private String name;
  private int balance;

  public Account() {}

  public Account(String accountNum, String name, int balance) {
    this.accountNum = accountNum;
    this.name = name;
    this.balance = balance;
  }

  // 예금하다 deposit
  int deposit(int amount) {
    return balance += amount;
  }

  // 출금하다 withdraw
  int withdraw(int amount) {
    return balance -= amount;
  }

  @Override
  public String toString() {
    return (
      "Account [accountNum=" +
      accountNum +
      ", name=" +
      name +
      ", balance=" +
      balance +
      "]"
    );
  }
}
