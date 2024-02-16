package lang;

import static java.lang.Math.*;

// 원래 다른 클래스 구문을 쓸때는 import 구문이 들어오지만
// java.lang : 기본 패키지여서 import 구문이 안들어옴

// Math : 구성 요소가 모두 static 상태
// import static 으로 Math.~ 을 빼고 사용가능
public class MathEx2 {

  public static void main(String[] args) {
    double val = 90.7552;
    System.out.println("round() " + round(val));
  }
}
