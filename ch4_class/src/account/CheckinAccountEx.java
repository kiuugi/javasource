package account;

public class CheckinAccountEx {

  public static void main(String[] args) {
    CheckingAccount cAccount = new CheckingAccount(
      "110-11",
      "홍길동",
      100000,
      "110-11"
    );

    CheckingTrafficCardAccount cTrafficCardAccount = new CheckingTrafficCardAccount(
      "110-12",
      "이춘향",
      1000000,
      "110-12",
      true
    );

    try {
      cAccount.pay("110-11", 40000);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println(
      cAccount.getOwner() + " 님의 현재잔액 " + cAccount.getBalance()
    );

    try {
      cTrafficCardAccount.payTarafficCard("110-12", 1200);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println(
      cTrafficCardAccount.getOwner() +
      " 님의 현재 잔액 " +
      cTrafficCardAccount.getBalance()
    );

    CreditLineAccount creditLineAccount = new CreditLineAccount(
      "110-13",
      "김진우",
      100000,
      5000000
    );

    try {
      creditLineAccount.withdraw(2000000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(
      creditLineAccount.getOwner() +
      "님의 현재 잔액 " +
      creditLineAccount.getBalance()
    );

    BonusPointAccount bAccount = new BonusPointAccount(
      "110-14",
      "김뿡",
      300000,
      0
    );

    try {
      bAccount.deposit(32947);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(
      bAccount.getOwner() +
      " 님의 현재 잔액 " +
      bAccount.getBalance() +
      " 현재 포인트 " +
      bAccount.getPoint()
    );
  }
}
