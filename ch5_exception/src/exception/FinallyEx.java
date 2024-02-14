package exception;

public class FinallyEx {

  public static void main(String[] args) {
    try {
      System.out.println(args[0]);
      System.out.println("예외 발생시 미 처리");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // 예외 발생여부와 상관없이 무조건 실행되어야 하는 구문 작성
      System.out.println("무조건 실행");
    }
    // try {} finally {} // try는 단독으로 올 수 없음
    // try {} catch (Exception e) {}
    // try {} catch (Exception e) {} finally{}
  }
}
