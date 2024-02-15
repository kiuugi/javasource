package lang;

// java.lang.* => 기본 패키지(import 구문 없이 사용가능)
// java.lang.Object : 모든 클래스의 부모 (최고 조상)
// obj가 제공하는 equals() 는 == 과 같은 역할(주소비교)
// obj가 넘겨주는 toString : 객체 자신의 정보를 문자열로 반환
public class ObjectEx {

  public static void main(String[] args) {
    // 인스턴스 생성 => 클래스 사용
    Object obj1 = new Object();
    Object obj2 = new Object();

    if (obj1.equals(obj2)) {
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두 객체는 다르다");
    }

    if (obj1 == obj2) {
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두 객체는 다르다");
    }

    System.out.println("obj1 toString() " + obj1.toString());
    System.out.println("obj2 toString() " + obj2.toString());

    Value value1 = new Value(10);
    Value value2 = new Value(10);
    // equals 는 그 객체가 가지고있는 주소를 비교함
    if (value1.equals(value2)) { // 오버라이딩된 equals
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두 객체는 다르다");
    }

    System.out.println("value1 toString() " + value1.toString());
    System.out.println("value1 toString() " + value1); // toString이 오버라이딩 된 상태이기 때문에 값이 나옴

    Member member1 = new Member("이춘향");
    Member member2 = new Member("이춘향");

    // equals() : 값비교
    // == : 주소비교
    System.out.println(member1.equals(member2) ? "같다" : "다르다");
    System.out.println(member1 == member2 ? "같다" : "다르다");
  }
}
