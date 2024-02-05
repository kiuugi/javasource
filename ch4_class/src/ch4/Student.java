package ch4;

// 멤버변수 초기값
// String : null
// int, long : 0
// float, double : 0.0
// char : ' '
// boolean : false

// 클래스 : 설계도
// 객체 : 실제 사용

public class Student {

  //클래스 안에 들어올 수 있는 것들
  // 멤버변수(=인스턴스변수, property, 속성, 필드) - 학생 객체가 가져야 하는 특징
  //학번(20241011), 이름(홍길동), 주소(서울시 종로구), 주민번호(1091215-1011237), 핸드폰(010-1234-5678),
  String id; // 학번 정수형태이지만 연산이 필요한건 아님.
  String name;
  String addr;
  String hp;

  // 멤버메소드(=인스턴스메소드, 기능)
  //속성을 변경시킬 수 있도록 메소드 작성
  void changeAddr() {}

  void changeHp() {}

  // 생성자(constructor) // 클래스 이름과 똑같이 생김.
  //클래스를 객체로 생성할 때 필수로 필요
  Student() {}
}
