package exam;

import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    int i = 0; // 잔액
    while (run) {
      System.out.println("--------------------------------------------");
      System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
      System.out.println("--------------------------------------------");
      System.out.print("메뉴 선택 >> ");

      int menu = sc.nextInt();

      switch (menu) {
        case 1: //1 예금액 입력, 잔액 = 잔액 + 예금액
          System.out.print("예금할 금액 입력 :");
          int in = sc.nextInt();
          i += in;
          System.out.println("예금액 :" + in + ", 잔액 :" + i);
          break;
        case 2: //2 출금액 입력, 잔액 = 잔액 - 출금액
          System.out.print("출금할 금액 입력 :");
          int out = sc.nextInt();
          if (i < out) break;
          i -= out;
          System.out.println("출금액 : " + out + ", 잔액 : " + i);
          break;
        case 3: //3 잔고 = 잔액출력
          System.out.println("잔액 : " + i);
          break;
        case 4:
          System.out.println("프로그램 종료");
          run = false;
          break;
      }
    }
  }
}
