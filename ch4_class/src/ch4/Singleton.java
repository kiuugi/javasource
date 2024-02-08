package ch4;

// Singletion 패턴 : 단 하나의 객체를 생성
public class Singleton {

  private static Singleton singleton;

  private Singleton() {} // private 생성자 : 외부에서 사용불가

  static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton; // null이 아니라면 이미 생성되어있는 객체를 줌
  }
}
