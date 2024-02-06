package ch4;

public class MyMathEx {

  public static void main(String[] args) {
    MyMath myMath = new MyMath(300L, 200L);
    // non-static 메소드 호출 //생성자(Consturctors)
    myMath.add();
    myMath.divide();
    myMath.multiply();
    myMath.subtract();

    System.out.println(
      myMath.add() +
      " " +
      myMath.divide() +
      " " +
      myMath.multiply() +
      " " +
      myMath.subtract()
    );
    // static 메소드 호출 / static 메소드를 가지고있는 클래스를 호출한다.
    MyMath.add(300L, 200L);
    MyMath.divide(300L, 200L);
    MyMath.multiply(300L, 200L);
    MyMath.subtract(300L, 200L);

    System.out.println(
      MyMath.add(300L, 200L) +
      " " +
      MyMath.divide(300L, 200L) +
      " " +
      MyMath.multiply(300L, 200L) +
      " " +
      MyMath.subtract(300L, 200L)
    );
  }
}
