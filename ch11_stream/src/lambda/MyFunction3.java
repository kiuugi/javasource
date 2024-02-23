package lambda;

/*
 * 함수형 인터페이스
 * 람다식을 포함가능(추상 메소드는 하나만 사용가능)
 * 람다식 == 익명 클래스 객체
 *
 */

@FunctionalInterface
public interface MyFunction3 {
  int method(int x, int y); // public abstract => 인터페이스의 기본값
  // 메소드 호출할 때 넣는 변수 x
}
