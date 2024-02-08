package account;

public class Account {

  private String accountNO;
  private String owner;
  private int balance;

  public Account(String accountNO, String owner, int balance) {
    this.accountNO = accountNO;
    this.owner = owner;
    this.balance = balance;
  }

  public String getAccountNO() {
    return accountNO;
  }

  public void setAccountNO(String accountNO) {
    this.accountNO = accountNO;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void deposit(int amount) {
    this.balance += amount;
  }

  public void withdraw(int amount) throws Exception {
    if (balance < amount) {
      throw new Exception("잔액이 부족합니다.");
    }
    balance -= amount;
    throw new Exception("정상 처리되었습니다.");
  }

  @Override
  public String toString() {
    return (
      "Account [accountNO=" +
      accountNO +
      ", owner=" +
      owner +
      ", balance=" +
      balance +
      "]"
    );
  }
}
