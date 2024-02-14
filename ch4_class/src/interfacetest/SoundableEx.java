package interfacetest;

public class SoundableEx {

  public static void main(String[] args) {
    Cat cat = new Cat();
    printSound(cat);
    // printSound(new Cat()); 위 2줄의 생략 // cat. 이라는 참조변수를 쓸 곳이 없기 때문에 줄이는것이 가능
    printSound(new Dog());
  }

  public static void printSound(Soundable soundable) {
    System.out.println(soundable.sound());
  }
}
