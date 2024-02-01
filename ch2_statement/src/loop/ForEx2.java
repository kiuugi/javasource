package loop;

public class ForEx2 {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }
    // i can do it. 5번 출력
    for (int i = 0; i < 5; i++) {
      System.out.println("I can do it.");
    }
    // 1 ~ 10 의 합계 구하기
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum = sum + i;
    }
    System.out.println("1 ~ 10 까지의 합 = " + sum);

    //1 ~ 10 출력, 10 ~ 1 출력
    for (int i = 1, j = 10; i <= 10; i++, j--) {
      System.out.printf("%d \t %d\n", i, j);
    }
  }
}
