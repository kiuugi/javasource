package lang;

// java.lang.StringBuffer : mutable (변경 가능한) 클래스, thread-safe
// java.lang.StringBuilder : mutable (변경 가능한) 클래스
public class StringBufferEx {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");

    // equals() : 주소비교 오버라이딩 안됨. , toString() 오버라이딩 된거 확인
    // String 으로 변환해서 equals() 사용하기
    // String str1 = new String(sb1); String 변환
    // String str2 = new String(sb2); new String에 집에넣기

    // String str1 = sb1.toString(); toString()으로 바꾸기
    // String str2 = sb1.toString(); String 변환해서 eqals() 사용하기

    System.out.println(sb1.equals(sb2) ? "같음" : "다름");
    System.out.println(sb1);
  }
}
