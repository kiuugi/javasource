package loop;

public class ForEx7 {

  public static void main(String[] args) {
    // 1~100까지 숫자 중에서 3의 배수만 더하기 (단, 9의 배수는 빼고)
    int sum = 0;
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0) {
        sum += i; //sum = sum + i
      }
    }
    System.out.println("1~ 100 숫자 중에서 3의 배수만 더하기 = " + sum);
    sum = 0;
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 && i % 9 != 0) {
        sum += i;
      }
    }
    System.out.println(
      "1~ 100 숫자 중에서 3의 배수만 더하기, 단, 9의 배수는 빼고 = " + sum
    );

    //3과 5배수의 합
    sum = 0;
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    System.out.println("3과 5 배수의 합 = " + sum);
  }
}
