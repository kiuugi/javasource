package shop;

public class ProductEx {

  public static void main(String[] args) {
    Product product = new CellPhone("쏌쑝어쩌구저쩌구", 500000, "LG");
    product.printDetail();
    product.printExtra();
  }
}
