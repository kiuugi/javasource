package thread;

public class UserMain {

  public static void main(String[] args) {
    // Calculator 를 공유하는 t1, t2
    Calculator calculator = new Calculator();

    Thread t1 = new User1(calculator);
    Thread t2 = new User2(calculator);

    // synchronized
    t1.start();
    t2.start();
  }
}
