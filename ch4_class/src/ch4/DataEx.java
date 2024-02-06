package ch4;

public class DataEx {

  public static void main(String[] args) {
    Data data = new Data();
    // x 변수 초기화
    data.x = 15;
    //change(data.x);
    change2(data);
    System.out.println("x 의 값 " + data.x);
  }

  //매개변수 (범위 : 로컬변수)
  //메소드를 호출할 때 매개변수로 지정한 값을 메소드의 매개변수에 복사
  // 매개변수의 타입 1) 기본형, 2) 참조형
  // 기본형 매개변수 : 변수의 값을 읽기만 가능
  // 참조형 매개변수 : 변수의 값을 읽고 변경 가능
  static void change(int x) { //기본형
    x = 20; // 값의 복사가 일어남.
  }

  static void change2(Data obj) { // 참조형 // 클래스 이름으로 데이터가 저장된 주소를 가르킴.
    obj.x = 20; //
  }
}
