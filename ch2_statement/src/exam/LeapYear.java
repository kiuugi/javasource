package exam;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    //년도를 입력 받은 후 윤년, 평년인지 출력
    // 윤년 : 해당 년도를 4로 나눈 나머지가 0과 같고, 100으로 나눈 나머지가 0이 아니거나 400으로 나눈 나머지가 0이면 윤년

    Scanner sc = new Scanner(System.in);

    System.out.print("년도 입력");
    int num = sc.nextInt();
    System.out.printf("입력한 년도 %d", num);

    if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
      System.out.println("윤년");
    } else {
      System.out.println("평년");
    }
  }
}
