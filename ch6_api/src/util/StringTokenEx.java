package util;

import java.util.StringTokenizer;

// java.util.StringTokenizer : 긴 문자열을 지정된 구분자를 기준으로 토큰이라는 여러 개의 문자열로 분리
// 구분자를 여러개 쓸 수는 있으나 구분자는 단 하나의 문자만 사용가능
public class StringTokenEx {

  public static void main(String[] args) {
    String result = "100,200,300,400";
    String[] delimter = result.split(","); // String[] 배열로 돌아옴
    for (String string : delimter) {
      System.out.println(string);
    }
    System.out.println();

    StringTokenizer st = new StringTokenizer(result, ",");
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
