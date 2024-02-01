package exam;

import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    //문자, 숫자 입력
    Scanner sc = new Scanner(System.in);
    System.out.print("+, -, *, /, % 중에서 하나를 입력"); // 입력받은 값 = "+" "" 안에 들어옴.
    String op = sc.nextLine(); // 문자열
    System.out.println("입력한 문자는 " + op);

    System.out.println("첫번째 숫자");
    int num = sc.nextInt(); // 숫자.
    System.out.println("두번째 숫자");
    int num1 = sc.nextInt();
    //System.out.println(num);

    switch (op) {
      case "+":
        System.out.println(num + num1);
        break;
      case "-":
        System.out.println(num - num1);
        break;
      case "*":
        System.out.println(num * num1);
        break;
      case "/":
        System.out.println(num / num1);
        break;
      case "%":
        System.out.println(num % num1);
        break;
    }

    int result = 0; //변수 초기화 이후에 사용
    switch (op) {
      case "+":
        result = num + num1;
        break;
      case "-":
        result = num - num1;
        break;
      case "*":
        result = num * num1;
        break;
      case "/":
        result = num / num1;
        break;
      case "%":
        result = num % num1;
        break;
    }
    System.out.printf("\n%d %s %d = %d \n", num, op, num1, result);
    System.out.println(num + " " + op + " " + num1 + " = " + result);
  }
}
