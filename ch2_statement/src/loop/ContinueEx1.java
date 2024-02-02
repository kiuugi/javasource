package loop;

// continue 이후의 구문 건너뛰게 함. 반복문 안에서 특정 구문을 실해시키지 않기 위함.
public class ContinueEx1 {

  public static void main(String[] args) {
    for (int i = 0; i < 11; i++) {
      if (i % 3 == 0) continue; //continue 이후의 구문을 건너뛰고 앞으로 다시감.
      System.out.println(i);
    }
    System.out.println("\n\n");

    for (int i = 0; i < 11; i++) {
      if (i % 2 != 0) continue;
      System.out.println(i);
    }
  }
}
