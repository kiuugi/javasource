package ch4;

public class PersonEx {

  public static void main(String[] args) {
    Person person = new Person();
    person.setName("홍길동");
    System.out.println(person.getName());
    System.out.println(person); //ch4.Person@5ca881b5 // 오버라이드 toString 만들어서 인스턴스 정보를 출력받음
    Person person2 = new Person();
    person2.setName("이춘향");
    System.out.println(person2.getName());
  }
}
