package condition;

import java.util.Scanner;

public class SwitchEx2 {

  public static void main(String[] args) {
    // 월 을 입력받아 계절 출력
    // 345 봄, 678 여름
    Scanner sc = new Scanner(System.in);

    System.out.print("월 입력");
    int num = sc.nextInt();
    System.out.printf("입력한 월 %d\n", num);

    switch (num) { // switch (A) == case (A) 라는 뜻
      case 3:
      case 4:
      case 5:
        System.out.println("현재 계절은 봄입니다.");
        break; // break를 만나면 switch 구문을 빠져나감
      case 6:
      case 7:
      case 8:
        System.out.println("현재 계절은 여름입니다.");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("현재 계절은 가을입니다.");
        break;
      case 12:
      case 1:
      case 2:
        System.out.println("현재 계절은 겨울입니다.");
        break;
      default:
        System.out.println("월을 확인해 주세요.");
        break;
    }
  }
}
