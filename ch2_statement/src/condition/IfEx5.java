package condition;

import java.util.Scanner;

// if() {if(){}}
public class IfEx5 {

  public static void main(String[] args) {
    //점수를 입력 받은 후 점수에 따라 출력
    //당신의 점수는 100입니다.
    //당신의 학점은 A+ 입니다.

    // >=90 A, >=98 A+, 90>=점수<94 A-, A
    // >=80 B, >=88 B+, 80>=점수<84 B-, B
    // 나머지는 C
    Scanner sc = new Scanner(System.in);

    System.out.print("점수 입력");
    int num = sc.nextInt();
    System.out.printf("입력한 점수 %d", num);
    char grade = ' ', opt = ' ';
    if (num >= 90) {
      grade = 'A';
      if (num >= 98) {
        opt = '+';
      } else if (num < 94) {
        opt = '-';
      } else {
        opt = ' ';
      }
    } else if (num >= 80) {
      grade = 'B';
      if (num >= 88) {
        opt = '+';
      } else if (num < 84) {
        opt = '-';
      } else {
        opt = ' ';
      }
    } else {
      grade = 'C';
    }

    System.out.println("등급은 " + grade + opt + "입니다.");
    System.out.printf(
      "당신의 점수는 %d, 등급은 %c%c 입니다.\n",
      num,
      grade,
      opt
    );
  }
}
