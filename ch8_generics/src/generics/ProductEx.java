package generics;

public class ProductEx {

  public static void main(String[] args) {
    Product<TV, String> product = new Product<>();
    product.setKind(new TV());
    product.setModel("스마트 TV");

    Product<Car, String> product2 = new Product<>();
    product2.setKind(new Car("현대"));
    product2.setModel("펠리세이드");
  }
}
