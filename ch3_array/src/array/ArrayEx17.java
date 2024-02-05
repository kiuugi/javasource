package array;

import java.util.Scanner;

public class ArrayEx17 {

  public static void main(String[] args) {
    String[][] words = {
      { "chair", "의자" },
      { "computer", "컴퓨터" },
      { "integer", "정수" },
    };
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < words.length; i++) {
      System.out.println((i + 1) + ") " + words[i][0] + "의 뜻은?");
      String answer = sc.nextLine();
      if (answer.equals(words[i][1])) {
        System.out.println("정답입니다.");
      } else {
        System.out.printf("오답입니다. 정답은 %s 입니다.\n", words[i][1]);
      }
    }
    //문자열 비교 equals() ==> "name".equals("name") ==> true
  }
}
