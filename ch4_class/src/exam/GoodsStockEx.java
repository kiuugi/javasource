package exam;

public class GoodsStockEx {

  public static void main(String[] args) {
    GoodsStock goodsStock = new GoodsStock("p1011", 150);

    System.out.println("추가된 재고수량 : " + goodsStock.addStock(20));

    System.out.println("감소된 재고수량 : " + goodsStock.subtrackStock(100));
  }
}
