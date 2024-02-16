package util;

import java.util.StringTokenizer;

public class StringTokenEx2 {

  public static void main(String[] args) {
    String str = "This is a test";

    // 기준을 안주면 " " 공백 하나를 기준으로 잘라줌
    StringTokenizer st = new StringTokenizer(str);
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    // split 에서 했던 " +" 같은 정규식은 처리 못함
    str = "x=100*(200+300)/2"; // Delimit / 자를 때 쓴 애들도 반환할 지 여부
    StringTokenizer st2 = new StringTokenizer(str, "=*/+()", true);
    while (st2.hasMoreTokens()) {
      System.out.println(st2.nextToken());
    }

    str = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
    StringTokenizer st3 = new StringTokenizer(str, ",|");
    while (st3.hasMoreTokens()) {
      System.out.println(st3.nextToken());
    }

    System.out.println();

    st3 = new StringTokenizer(str, "|");
    while (st3.hasMoreTokens()) {
      String token = st3.nextToken();
      //   System.out.println(st3.nextToken());

      StringTokenizer st4 = new StringTokenizer(token, ",");
      while (st4.hasMoreTokens()) {
        System.out.println(st4.nextToken());
      }
      System.out.println("---------------");
    }
  }
}
