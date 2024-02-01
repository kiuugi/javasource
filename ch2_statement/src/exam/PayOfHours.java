package exam;

import java.util.Scanner;

public class PayOfHours {

  public static void main(String[] args) {
    //근무 시간 입력
    // 시간 당 9800
    // 8 시간이 넘어가는 시간은 원래 받는 금액의 1.5%
    // 오늘 받는 임금은 15000

    Scanner sc = new Scanner(System.in);

    System.out.print("근무시간 입력");
    int num = sc.nextInt();
    System.out.println(num * 9800);

    if (num > 8) {
      System.out.println(
        "오늘 받는 임금은 " + (((num - 8) * 9800) * 1.5) + "입니다."
      );
    } else {
      System.out.println("오늘 받는 임금은 " + num * 9800 + "입니다.");
    }

    int pay = 0, rate = 9800;
    if (num > 8) {
      pay = (int) ((num - 8) * rate * 1.5) + (rate * 8);
    } else {
      pay = num * rate;
    }
    System.out.println("받을 임금은 " + pay + "입니다.");
  }
}
