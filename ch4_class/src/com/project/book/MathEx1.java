package com.project.book;

// java.lang 패키지는 기본 import 상태임.
// Math 클래스는 모든 요소가 static 임
import static java.lang.Math.*; // 자바패키지에있는 lang 패키지에있는 메스의 모든것

public class MathEx1 {

  public static void main(String[] args) {
    //Math
    System.out.println(PI); // import 구문으로 Math. 생략함
    System.out.println(E);
    System.out.println(random());
    System.out.println(ceil(3.4));
  }
}
