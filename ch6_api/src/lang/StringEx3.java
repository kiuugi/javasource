package lang;

import java.util.Arrays;

public class StringEx3 {

  public static void main(String[] args) {
    String str1 = "Hello!! Java";

    // 문자열을 => char 배열
    // str1.length(); : str1의 길이 리턴

    char[] ch = new char[str1.length()];

    for (int i = 0; i < str1.length(); i++) {
      ch[i] = str1.charAt(i);
    }

    System.out.println(ch);
    System.out.println(Arrays.toString(ch));

    String str2 = "자바 프로그래밍";
    // '프'라는 문자가 존재한다면 들어있음 or 없음

    if (str2.contains("프")) {
      System.out.println("들어있음");
    } else {
      System.out.println("없음");
    }

    System.out.println(str2.contains("프") ? "들어있음" : "없음");
  }
}
