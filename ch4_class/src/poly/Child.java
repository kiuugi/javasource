package poly;

public class Child extends Parent {

  String field2;

  @Override // 재정의 (기능추가)
  public void method2() {
    System.out.println("Child-method2()");
  }

  public void method3() {
    System.out.println("child-method3()");
  }
}
