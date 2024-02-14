package poly;

public class Buyer {

  int money = 1000; // 소유금액
  int bonusPoint = 0;

  void buy(Product p) {
    if (money < p.price) {
      System.out.println("잔액 부족");
      return;
    }
    money -= p.price; // private 안붙어서 가능
    bonusPoint += p.bonusPoint;
    System.out.println(" 제품을 구매하셨습니다.");
  }
}
