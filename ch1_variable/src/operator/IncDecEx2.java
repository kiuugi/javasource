package operator;

// 단항연산자 : 증감연산자 => ++, --
//               ++ => 변수 + 1, -- => 변수 - 1
public class IncDecEx2 {

  public static void main(String[] args) {
    int x = 10, y = 20;

    x++; // 여기서 +1이 이루어짐
    y++;

    System.out.printf("x = %d, y = %d\n", x, y);

    x--;
    y--;

    System.out.printf("x = %d, y = %d\n", x, y);
  }
}
