package loop;

public class ForEx4 {

  public static void main(String[] args) {
    // 1) int i = 1
    // 2) i <= 5
    // 3) int j = 1;
    // 4) j <= 10
    // 5) sout(*)
    // 6) j++
    // 7) j <= 10
    // 8) sout(*)
    // .........
    // 9) j == 11 안쪽 for문 종료
    // 10) sout();
    // 11) 바깥쪽 for i++
    // 바깥쪽 for문이 참일 때까지 반복수행
    for (int i = 0; i <= 5; i++) {
      for (int j = 0; j <= 10; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
