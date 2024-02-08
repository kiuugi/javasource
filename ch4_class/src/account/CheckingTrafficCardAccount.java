package account;

// 은행 : Account
// 은행 + 체크카드 : Checking Account
// 은행 + 체크카드 + 교통카드 : CheckingTrafficCardAccount
// 예금, 출금 => 부모(Account)
// 카드 사용금액 지불 => pay() 부모(CheckingAccount)
// 교통비 지불한다 => patTarafficCard()
public class CheckingTrafficCardAccount extends CheckingAccount {

  private boolean hasTarfficCard;

  public CheckingTrafficCardAccount(
    String accountNO,
    String owner,
    int balance,
    String cardNo,
    boolean hasTarfficCard
  ) {
    super(accountNO, owner, balance, cardNo);
    this.hasTarfficCard = hasTarfficCard;
  }

  //cardNo, amount, 교통카드 기능 여부
  void payTarafficCard(String cardNo, int amount) throws Exception {
    if (!hasTarfficCard) {
      throw new Exception("교통 카드가 아닙니다.");
    }
    pay(cardNo, amount);
  }
}
