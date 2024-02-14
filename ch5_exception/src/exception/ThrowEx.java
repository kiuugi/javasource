package exception;

// 고의로 예외 발생 시키기
// throw
public class ThrowEx {

  public static void main(String[] args) {
    try {
      throw new Exception("고의로 발생시킨 예외"); // 중간에 예외를 발생시켜 중지시킴
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
