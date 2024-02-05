package exam;

public class Account {

  // 계좌번호(110-12-12345), 계좌주 이름, 잔액
  private String accountNum;
  private String name;
  private String balance;

  public Account() {}

  public Account(String accountNum, String name, String balance) {
    this.accountNum = accountNum;
    this.name = name;
    this.balance = balance;
  }
}
