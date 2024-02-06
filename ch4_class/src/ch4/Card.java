package ch4;

public class Card {

  private String kind; // 무늬
  private int number; // 숫자

  //클래스 변수 : 공유
  //클래스 변수 : 클래스가 로딩될 때 생성되고 프로그램이 종료될 때 소멸
  static int wideth = 100;
  static int height = 150;

  public Card(String kind, int number) {
    this.kind = kind;
    this.number = number;
  }
}
