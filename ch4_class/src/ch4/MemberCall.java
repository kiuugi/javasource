package ch4;

public class MemberCall {

  int iv = 10; // 인스턴스 변수
  static int cv = 20; // 클래스변수

  // 클래스 메소드 // 메소드에도 static이 붙을 수 있음
  static void staticMethod1() {
    System.out.println(cv); //static 메소드 에서는 static이 붙은애들을 부를 수 있다. 다른 변수들도 가능은 하지만 변수가 로딩되는 시점이 다르기때문에 에러가 나옴.
    //System.out.println(iv);
  }

  void instanceMethod1() {
    System.out.println(iv);
    System.out.println(cv);
  }
}
