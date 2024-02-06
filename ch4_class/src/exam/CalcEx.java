package exam;

public class CalcEx {

  public static void main(String[] args) {
    // 객체 생성
    Calc calc = new Calc();
    int result = calc.add(15, 20);

    System.out.println("덧셈 결과 : " + result);

    calc.subtract(0, 0);
    result = calc.subtract(123, 23);
    System.out.println("뺄셈 결과 : " + result);

    calc.multiply(0, 0);
    System.out.println("곱셈 결과 : " + calc.multiply(3, 5));

    //calc.divide(0, 0);
    result = calc.divide(20, 10);
    System.out.println("나눗셈 결과 : " + result);
  }
}
