package operator;

//산술연산자 : +, -, *, /, %(나머지값)
public class ArithmeticEx1 {

  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 2;
    int result1 = num1 + num2;
    System.out.printf("%d + %d = %d\n", num1, num2, result1);
    result1 = num1 - num2;
    System.out.printf("%d - %d = %d\n", num1, num2, result1);
    result1 = num1 * num2;
    System.out.printf("%d * %d = %d\n", num1, num2, result1);
    result1 = num1 / num2;
    System.out.printf("%d / %d = %d\n", num1, num2, result1); // 정수 나눗셈을 시키면 몫만나옴
    result1 = num1 % num2;
    System.out.printf("%d %% %d = %d\n", num1, num2, result1); // 나머지값

    double d1 = 6.0d;
    int d2 = 4;
    double result2 = d1 / d2;
    System.out.printf("%f / %d = %f\n", d1, d2, result2);

    result2 = d1 % d2;
    System.out.printf("%f %% %d = %f\n", d1, d2, result2);

    char ch1 = 'A' + 1;
    // char ch2 = ch1 + 1; -- 변수에 산술을 하려고하면 형태변환이 일어나서 에러가남.
    System.out.printf("ch = %c", ch1);
  }
}
