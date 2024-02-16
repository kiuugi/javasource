package lang;

// 기본형 값들을 객체로 사용할 때가 있음 / 기본타입으로 할수없는 메소드들을 사용
// java.lang.Byte ==> byte 의 객체
// java.lang.Short ==> short 의 객체
// java.lang.Character ==> char
// java.lang.Integer ==> int
// java.lang.Long ==> long
// java.lang.Float ==> float
// java.lang.Double ==> double
// java.lang.Boolean ==> boolean

public class WrapperEx {

  public static void main(String[] args) {
    int i = 10; // 기본타입

    Integer i2 = 10; // 객체타입 / i2.~
    Integer i3 = Integer.valueOf(20); // 객체타입

    // intValue() : Integer => int // 객체타입 i2를 기본타입 result로 바꿔줌
    int result = i2.intValue();
    int result2 = i2; // 자동형변환
  }
}
