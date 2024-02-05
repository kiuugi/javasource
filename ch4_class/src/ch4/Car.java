package ch4;

public class Car {

  // 자동차의 속성 : 제조사, 이름, 옵션(), 속도, 연료, 크기, ... => 필요한 것들만 변수로 작성
  String company;
  String model;
  int maxSpeed;

  // 기능 : 전진, 후진, => 메소드로 작성
  // 변수 값 변경 => 메소드로 작성
  void forward() {
    System.out.println("전진한다.");
  }

  void backward() {
    System.out.println("후진한다.");
  }
}
