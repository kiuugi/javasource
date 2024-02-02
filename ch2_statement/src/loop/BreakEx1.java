package loop;

public class BreakEx1 {

  public static void main(String[] args) {
    // break; => switch
    int sum = 0, i = 0;
    while (true) {
      if (sum > 100) break; // break 는 자신이 들어있는 {} 블럭을 빠져나가게됨.
      ++i;
      sum += i;
    }
    System.out.printf("i = %d, sum = %d\n", i, sum);
  }
}
