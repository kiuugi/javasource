package ch4;

public class FactorialEx {

  // f(n) = n * f(n-1) 단 f(1) = 1
  public static void main(String[] args) {
    System.out.println(factorial(4));
  }

  static int factorial(int n) {
    int result = 0;

    // 재귀 호출 : 메소드 자신을 호출 (반복문보다 살짝 더 느림)
    if (n == 1) {
      result = 1;
    } else {
      result = n * factorial(n - 1); // 자신을 호츌함
    }
    return result;
  }
}
