package lang;

// java.lang.String : 문자열 클래스
// - 변경 불가능한(immutable) 클래스 : 읽기만 가능
public class StringEx1 {

  public static void main(String[] args) {
    // 인스턴스 생성
    String str = new String("abc");
    String str2 = "abc"; // new로 생성하는것과 저장 방식이 다름
    String str3 = "abc";
    // == 주소비교 // 저장방식이 여러가지 있어서 같은 문자열이라도 주소가 다르게 저장될 수 있음
    System.out.println(str2 == str3 ? "같음" : "다름"); // 같음
    System.out.println(str2 == str ? "같음" : "다름"); // 다름

    // String equals() 오버라이딩 : 값 비교
    // String 클래스는 equals()를 이미 값 비교로 오버라이딩된 상태
    System.out.println(str2.equals(str3) ? "같음" : "다름"); // 같음
    System.out.println(str2.equals(str) ? "같음" : "다름");

    String a = "a";
    String b = "b";
    a = a + b; // 문자열 결합 횟수가 많다면 효율성이 떨어질 수 있음 => StringBuffer, StringBilder 클래스 사용// 원래 a의 저장공간을 파괴하고 새로운 저장공간에a = "ab"를 저장
    System.out.println(a);
  }
}
