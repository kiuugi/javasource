package operator;

// 앞의 타입 시작을 대문자로 하면 객체타입
public class CompareEx2 {

  public static void main(String[] args) {
    //비교 연산자 결과는 true or false 로 나옴
    //문자 vs 문자열
    // '' vs  " "
    // 'A'    "A"

    String str1 = "홍길동";
    String str2 = "홍길동";
    String str3 = new String("홍길동");

    System.out.println(str1 == str2);
    System.out.println(str1 == str3); // 같은 홍길동 이 아닌 다른 객체
    // 문자열 비교는 equals() 사용
    System.out.println(str1.equals(str3));
  }
}
