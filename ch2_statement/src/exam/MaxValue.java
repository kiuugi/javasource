package exam;

import java.util.Scanner;

public class MaxValue {

  public static void main(String[] args) {
    //숫자 세 개를 입력 받은 후 가장 큰 숫자를 출력
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 숫자 입력");
    int num1 = sc.nextInt();

    System.out.print("두번째 숫자 입력");
    int num2 = sc.nextInt();

    System.out.print("세번째 숫자 입력");
    int num3 = sc.nextInt();

    if (num1 > num2 && num1 > num3) { // 이거말고 방법이 뭐있지 하다가 밑에꺼 보니까 갑자기 내가 바보된기분
      System.out.println(num1);
    } else if (num2 > num1 && num2 > num3) {
      System.out.println(num2);
    } else if (num3 > num1 && num3 > num2) {
      System.out.println(num3);
    }
    //가장 큰 수
    int max = num1; // if를 거름망처럼 사용
    if (max < num2) {
      max = num2;
    }
    if (max < num3) {
      max = num3;
    }
    System.out.println("세 수 중 가장 큰 수 " + max);

    //가장 작은 수
    int min = num1;
    if (min > num2) {
      min = num2;
    }
    if (min > num3) {
      min = num3;
    }
    System.out.println("세 수 중 가장 작은 수 " + min);
  }
}
