package exam;

public class GoodsStock {

  // 상품코드(p1011) goodsCode, 재고수량(300) stockNum
  private String goodsCode;
  private int stockNum;

  //생성자
  public GoodsStock() {
    //default 생성자 // 기본값으로 나옴
  }

  public GoodsStock(String goodsCode, int stockNum) {
    this.goodsCode = goodsCode;
    this.stockNum = stockNum;
  }
}
