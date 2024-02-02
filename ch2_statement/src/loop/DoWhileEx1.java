package loop;

import java.util.Scanner;

public class DoWhileEx1 {

  public static void main(String[] args) {
    int input = 0, answer = 0;

    answer = (int) (Math.random() * 100) + 1;

    Scanner sc = new Scanner(System.in);

    //반복문 - for, while, do~while
    // 조건이 맞지 않을 때 do~while의 경우는 한번은 실행을 하게된다.

    do {
      System.out.println("1~100 사이의 정수 입력 : ");
      input = sc.nextInt();

      if (answer < input) {
        System.out.println("더 작은 수를 입력하세요");
      } else {
        System.out.println("더 큰수를 입력하세요");
      }
    } while (input != answer); // input != anser 이 참이라면 do 반복.
    System.out.println("정답입니다!!. 프로그램을 종료합니다.");
  }
}
