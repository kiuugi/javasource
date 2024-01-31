package operator;

//산술연산자 : +, -, *, /, %(나머지값)
public class ArithmeticEx2 {

  public static void main(String[] args) {
    // int apple = 1;
    // double pieceUnit = 0.1d;
    // int number = 7;
    // double result = apple - number * pieceUnit;
    // System.out.println(result); // 실수가 정확하게 계산되지 않아 될수있으면 정수로 표현해서 계산

    int apple = 1;
    int totalPiece = apple * 10;
    int number = 7;
    int temp = totalPiece - number;
    double result = temp / 10.0;
    System.out.println(result);

    //런타임 예외사항
    //Exception in thread "main" java.lang.ArithmeticException(산술 연산자에서 에러가 났다): / by zero(이유)
    System.out.println(10 / 0);
  }
}
