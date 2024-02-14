package exception;

public class ArithmeticEx {

  // 런타임 exception
  // Exception in thread "main" java.lang.ArithmeticException: / by zero
  // 0으로 나눴을때.

  public static void main(String[] args) {
    int number = 100;
    int result = 0;
    for (int i = 0; i < 10; i++) {
      try {
        result = number / (int) (Math.random() * 10);
        System.out.println(result);
      } catch (ArithmeticException e) {
        System.out.println("0"); // 예외상황 나오면 0으로 표시해줘
      }
    }
  }
}
