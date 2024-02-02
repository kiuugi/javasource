package exam;

public class DiceSum {

  public static void main(String[] args) {
    /* 주사위 2개를 굴려 나오는 숫자를 (숫자1,숫자2) 형태로 출력
     * 주사위 2개의 합이 5일때 중단
     */
    int i = 0, i1 = 0;

    while (true) {
      i = (int) (Math.random() * 6) + 1;
      i1 = (int) (Math.random() * 6) + 1;
      System.out.printf("(%d, %d)\n", i, i1);

      if (i + i1 == 5) break;
    }
    System.out.println(i + i1);
  }
}
