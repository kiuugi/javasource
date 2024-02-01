package condition;

import java.util.Scanner;

public class SwitchEx3 {

  public static void main(String[] args) {
    //가위 : 1, 바위 : 2, 보 : 3
    int com = (int) (Math.random() * 3) + 1; // 3 *
    System.out.println(com);
    //사용자의 숫자 결정
    System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력해 주세요 >>> ");

    Scanner sc = new Scanner(System.in);
    int user = sc.nextInt();

    // com - user
    // com : 2 user : 1 당신이 졌습니다.     1  -2   1
    // com : 2 user : 3 당신이 이겼습니다.  -1  -1   2
    // com : 2 user : 2 비겼습니다.         0   0   0

    switch (com - user) { // switch () == case () 괄호 안에 들어가는 값이 같아야함.
      case 2:
      case -1:
        System.out.println("당신이 졌습니다.");
        break;
      case 1:
      case -2:
        System.out.println("당신이 이겼습니다.");
        break;
      case 0:
        System.out.println("비겼습니다.");
    }
  }
}
