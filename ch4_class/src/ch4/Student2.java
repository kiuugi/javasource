package ch4;

// 멤버변수 초기값
// String : null
// int, long : 0
// float, double : 0.0
// char : ' '
// boolean : false

// 클래스 : 설계도
// 객체 : 실제 사용

public class Student2 {

  //클래스 안에 들어올 수 있는 것들
  // 멤버변수(=인스턴스변수, property, 속성, 필드) - 학생 객체가 가져야 하는 특징
  //학번(20241011), 이름(홍길동), 주소(서울시 종로구), 주민번호(1091215-1011237), 핸드폰(010-1234-5678),
  private String id; // 학번 정수형태이지만 연산이 필요한건 아님.
  private String name;
  private String addr; // private 사용시 다른 클래스에서 직접 접근이 불가능함.
  private String hp;

  // 멤버메소드(=인스턴스메소드, 기능)
  //속성을 변경시킬 수 있도록 메소드 작성
  // 메소드(==함수) 작성 규칙
  // 리턴타입 메소드명 (){}
  // return type : 정수형, 실수형, 불린형, 문자형, String, 배열, void 다 가능.

  void changeAddr(String addr) {
    // 멤버변수 addr의 값을 변경
    this.addr = addr;
    // 리턴 값은 없음.
  }

  void changeHp(String hp) {
    this.hp = hp;
  }

  // 생성자(constructor) // 클래스 이름과 똑같이 생김.// 멤버변수 초기화(초기화를 안하면 기본값이기 때문에)
  //클래스를 객체로 생성할 때 필수로 필요 // 여러 생성자를 사용할 수 있지만 ()안쪽이 달라야 한다.
  Student2() {} // 여기 생성자와 Ex쪽에 생성자를 부른문장의 양식이 같으면 됨.

  public Student2(String id, String name, String addr) { // 우클릭 소스액션>
    this.id = id;
    this.name = name;
    this.addr = addr;
  }

  Student2(String id, String name, String addr, String hp) {
    this.id = id; // this.id == private String id // id == String id 바로 위에있는
    this.name = name; // 연파랑 변수들 클릭해보면 같은걸 알 수 있음
    this.addr = addr;
    this.hp = hp;
  }

  @Override
  public String toString() {
    return (
      "Student2 [id=" +
      id +
      ", name=" +
      name +
      ", addr=" +
      addr +
      ", hp=" +
      hp +
      "]"
    );
  }
}
