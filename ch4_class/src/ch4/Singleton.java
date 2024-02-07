package ch4;

public class Singleton {

  private static Singleton singleton;

  private Singleton() {} // private 생성자 : 외부에서 사용불가

  static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}
