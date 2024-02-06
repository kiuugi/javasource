package exam;

public class AccountEx {

  public static void main(String[] args) {
    Account account = new Account("01-017-12345678", "이춘향", 100000);
    int balance = account.deposit(40000);
    System.out.println("잔액 : " + balance);

    balance = account.withdraw(10000);
    System.out.println("잔액 : " + balance);

    System.out.println(account);
  }
}
