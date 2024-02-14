package interfacetest;

public abstract class Calculator implements Calc { // 추상 클래스를 추상 클래스로 상속받음

  // times , divide 추상 메소드
  // add, substract 만 구현함.
  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int substract(int num1, int num2) {
    return num1 - num2;
  }
}
