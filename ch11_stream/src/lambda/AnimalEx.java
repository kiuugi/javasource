package lambda;

public class AnimalEx {

  public static void main(String[] args) {
    // 인터페이스 활용 방법
    Animal animal = new Lion();
    animal.eat();

    // 람다식으로 활용하기
    Animal animal2 = () -> System.out.println("풀을 먹는다."); // 인페이스의 메서드가 1개라 가능(함수형 인터페이스) // 인텊페이스 구현
    animal2.eat(); // 구현 클래스를 생략하고 람다식으로 활용
  }
}
