package condition;

// if ~ else if 처리 대체
// switch case
public class SwitchEx1 {

  public static void main(String[] args) {
    char ch1 = 'a';
    switch (ch1) {
      case 'a':
        System.out.println("a 입니다.");
        break; // 실행 되었다면 구문 동작을 마침.
      case 'b':
        System.out.println("b 입니다.");
        break;
      default:
        System.out.println("a도 b도 아닙니다.");
        break;
    }
  }
}
