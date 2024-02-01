package operator;

import java.util.Scanner;

public class ConditionEx2 {

  public static void main(String[] args) {
    //숫자 입력 받은 후 그 숫자가 양수인지 음수인지 판별
    Scanner sc = new Scanner(System.in);

    System.out.print("숫자 입력");
    int num = sc.nextInt();

    System.out.println(num >= 0 ? "양수" : "음수");

    //짝수인지 홀수인지 판별
    System.out.println(num % 2 == 0 ? "짝수" : "홀수");

    char ch1 = 'a'; // 형변환 필요 없음
    //ch1이 영문자 이거나 1~9 사이의 숫자인지 판별 // 65 ~ 90, 97 ~ 122 , 49 ~ 57
    System.out.println( // ch1을 숫자를 비교, 문자를 그대로 비교, (ch1 >= 'A' && ch1 <= 'Z')
      ch1 >= 65 &&
      ch1 <= 90 ||
      ch1 >= 97 &&
      ch1 <= 122 ||
      ch1 >= 49 &&
      ch1 <= 57
    );
    boolean result =
      ch1 >= 'A' &&
      ch1 <= 'Z' ||
      ch1 >= 'a' &&
      ch1 <= 'z' ||
      ch1 >= 1 &&
      ch1 <= 9;
    System.out.println(result);
    // boolean result ch1 >= 'A' && ch1 <= 'Z' || ch1 >= 'a' && ch1 <= 'z' || ch1 >= 1 && ch1 <= 9 ? true : fales;
  }
}
