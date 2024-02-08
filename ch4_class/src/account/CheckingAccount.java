package account;

// 은행 + 채크카드
public class CheckingAccount extends Account {

  private String cardNo;

  public CheckingAccount(
    String accountNO,
    String owner,
    int balance,
    String cardNo
  ) {
    super(accountNO, owner, balance); //defalt 생성자가 없으니 만들어줘야함
    this.cardNo = cardNo;
  }

  //pay(String cardNo, int amount)
  //cardNo가 일치하는지 확인, 사용금액이 잔액보다 작은지도 확인
  //일치하지 않으면 지불불가
  //일치하고, 금액이 작으면 잔액 - 사용금액

  void pay(String cardNo, int amount) throws Exception {
    if (!this.cardNo.equals(cardNo)) {
      throw new Exception("지불불가");
    }
    //setBalance(getBalance() - amount);
    withdraw(amount);
  }
}
