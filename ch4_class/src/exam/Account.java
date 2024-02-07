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
    if (balance < amount) {
      System.out.println("잔액이 부족합니다.");
      return balance;
    }
    return balance -= amount;
  }

  public String getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return (
      "Account [계좌번호 = " +
      accountNum +
      ", 이름 = " +
      name +
      ", 잔액 = " +
      balance +
      "]"
    );
  }
}
