package ch4;

public class SingletonEx {

  public static void main(String[] args) {
    // Singletion singleton = new Singleton(); The constructor Singleton() is not visible
    // 생성자에 private이 붙어있어서 객체를 못만듬
    Singleton singleton = Singleton.getInstance(); // static이 붙어있어서 객체가 없어도 호출가능
    Singleton singleton2 = Singleton.getInstance();
    System.out.println(singleton == singleton2); // true
  }
}
