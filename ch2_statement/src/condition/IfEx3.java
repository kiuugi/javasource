package condition;

import java.util.Scanner;

public class IfEx3 {

  public static void main(String[] args) {
    // 점수 입력 받은 후 짝,홀수 출력
    Scanner sc = new Scanner(System.in);

    System.out.print("점수 입력");
    int num = sc.nextInt();
    System.out.printf("입력한 점수 %d\n", num);

    if (num % 2 == 0) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
  }
}
