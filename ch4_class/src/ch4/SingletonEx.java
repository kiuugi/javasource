package ch4;

public class SingletonEx {

  public static void main(String[] args) {
    // Singletion singleton = new Singleton(); The constructor Singleton() is not visible
    // 생성자에 private이 붙어있어서 객체를 못만듬
    Singleton singleton = Singleton.getInstance(); // static이 붙어있어서 객체가 없어도 호출가능
    Singleton singleton2 = Singleton.getInstance(); // 새롭게 new를 해서 생성한 객체가 아님. 그냥 get으로 생성되어있는 객체를 불러옴.

    System.out.println(singleton == singleton2); // true
    // 모두 Singleton에서 생성한 하나의 객체 // 같은 주소
  }
}
