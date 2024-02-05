package ch4;

public class StudentEx {

  public static void main(String[] args) {
    // 객체(인스턴스)를 생성한다.
    Student student = new Student();

    // 생성된 인스턴스 값 확인.
    System.out.println(student); //ch4.Student@5ca881b5
    System.out.println(student.id); //null
    System.out.println(student.name); //null
    System.out.println(student.addr); //null
    System.out.println(student.hp); //null

    //생성된 인스턴스에 값 할당.
    student.id = "20241212";
    student.name = "홍길동";
    student.addr = "서울시 종로구";
    student.hp = "010-1234-5678";

    System.out.println(student.id);
    System.out.println(student.name);
    System.out.println(student.addr);
    System.out.println(student.hp);

    //생성자 호출
    Student student1 = new Student();
    student1.id = "20241213";
    student1.name = "성춘향";
    student1.addr = "구로구 궁동";
    student1.hp = "010-8765-4321";
  }
}
