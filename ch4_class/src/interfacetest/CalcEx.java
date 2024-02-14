package interfacetest;

public class CalcEx {

  public static void main(String[] args) {
    // 참조 변수가 사용할 수 있는 범위 제한
    Calc calc = new CompleteCalc(); // new 를 쓸수 있는것이 CompleteCalc밖에 없음
    Calculator calc2 = new CompleteCalc();
    CompleteCalc calc3 = new CompleteCalc();

    System.out.println("calc3 add " + calc3.add(10, 2));
    System.out.println("calc3 substract " + calc3.substract(20, 3));
    System.out.println("calc3 divide " + calc3.divide(25, 2));
    System.out.println("calc3 times " + calc3.times(3, 6));
    calc3.showInfo();

    System.out.println("calc add " + calc.add(3, 6));
    System.out.println("calc divide " + calc.divide(3, 6));
    System.out.println("calc substract " + calc.substract(3, 6));
    System.out.println("calc times " + calc.times(3, 6));
    //calc.showInfo();

    System.out.println("calc2 add " + calc2.add(3, 6));
    System.out.println("calc2 divide " + calc2.divide(3, 6));
    System.out.println("calc2 times " + calc2.times(3, 6));
    System.out.println("calc2 substract " + calc2.substract(3, 6));
    //calc2.showInfo();
  }
}
