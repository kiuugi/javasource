package ch4;

public class StudentEx2 {

  public static void main(String[] args) {
    Student2 obj = new Student2(
      "20231423",
      "김철수",
      "서울시 구로구",
      "010-4568-1234"
    );
    // obj.id = "20231423"; private 사용시 다른 클래스에서 직접 접근이 불가능함.
    System.out.println(obj);

    // 주소 변경
    obj.changeAddr("서울시 중남구");
    // 핸드폰 변경
    obj.changeHp("010-9876-5432");
    // 변경 확인
    System.out.println(obj);

    Student2 obj2 = new Student2(); // new : 생성자 사용 // 생성자는 멤버변수를 초기화한다.
    System.out.println(obj2);

    Student2 obj3 = new Student2("20245812", "김진수", "경기도 수원시");
    System.out.println(obj3);
  }
}
