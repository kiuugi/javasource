package loop;

public class BreakEx2 {

  public static void main(String[] args) {
    // break; => switch
    int i = 0;

    while (true) {
      i = (int) (Math.random() * 6) + 1;
      //주사위를 굴려서 6 일때만 반복문 종료
      System.out.println(i);
      if (i == 6) break;
    }
    System.out.println("종료");
  }
}
