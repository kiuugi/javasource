package condition;

import java.util.Scanner;

public class SwitchEx2_1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("월 입력");
    int num = sc.nextInt();
    System.out.printf("입력한 월 %d\n", num);

    if (num >= 3 && num <= 5) { //if 조건에 맞는 애가 들어가면 끝. 뒤에서 또 조건에 맞는 else if 문이 있어도 실행X // 위에서부터 차래로 내려옴.
      System.out.println("지금 계절은 봄입니다.");
    } else if (num >= 6 && num <= 8) {
      System.out.println("지금 계절은 여름입니다.");
    } else if (num >= 9 && num <= 11) {
      System.out.println("지금 계절은 가을입니다.");
    } else if (num == 1 || num == 2 || num == 12) {
      System.out.println("지금 계절은 겨울입니다."); // 겨울만 범위가 다르기 때문에 겨울을 else로 빼는 방법도 존재함
    } else {
      System.out.println("월을 확인해 주세요");
    }

    if (num <= 12) { // 이렇게 범위를 잘 나눠서 앞에도 들어간 숫자가 뒤에서도 들어가야하는 일 만 없으면 됨. // 대신 이건 음수가 들어가면 안됨;;
      if (num == 12) {
        System.out.println("겨울");
      } else if (num >= 9) {
        System.out.println("가을");
      } else if (num >= 6) {
        System.out.println("여름");
      } else if (num >= 3) {
        System.out.println("봄");
      } else if (num >= 1) {
        System.out.println("겨울");
      }
    } else {
      System.out.println("확인 부탁");
    }
  }
}
