package ch4;

public class PersonEx {

  public static void main(String[] args) {
    // Person person = new Person();
    // person.setName("홍길동");
    // System.out.println(person.getName());
    // System.out.println(person); //ch4.Person@5ca881b5 // 오버라이드 toString 만들어서 인스턴스 정보를 출력받음
    // Person person2 = new Person();
    // person2.setName("이춘향");
    // System.out.println(person2.getName());

    Person person = new Person("홍길동", "korea");
    person.setName("김길동");
    //nation은 상수이기때문에 바꾸지 못함
    Person person2 = new Person("장길동", "korea");
    person2.setName("김길동");
    // private와 , final 때문에 불가능 Person.PI = 1.123456;

    System.out.println(Person.getPi());

    System.out.println(person == person2); // false
  }
}
