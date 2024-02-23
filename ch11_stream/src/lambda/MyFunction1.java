package lambda;

/*
 * 함수형 인터페이스
 * 람다식을 포함가능(추상 메소드는 하나만 사용가능)
 * 람다식 == 익명 클래스 객체
 *
 */

@FunctionalInterface
public interface MyFunction1 {
  void method(); // public abstract => 인터페이스의 기본값
  // void print(); // 메소드가 1개만 가능
}
