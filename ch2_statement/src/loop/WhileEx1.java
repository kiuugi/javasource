package loop;

public class WhileEx1 {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("I can do it.");
    }

    int i = 0;
    while (i < 5) { // 옆에 조건, 위에정의, 마지막에 증감.
      System.out.println("I can do it");
      i++;
    }

    int sum = 0;/* 
    for (int i = 1; i <= 10; i++) {
      sum = sum + i;
    }
    System.out.println("1 ~ 10 까지의 합 = " + sum);*/
    i = 0;
    while (i <= 10) {
      sum += i;
      i++;
    }
    System.out.println("1 ~ 10 까지의 합 = " + sum);
  }
}
