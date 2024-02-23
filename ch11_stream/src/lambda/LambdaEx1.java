package lambda;

public class LambdaEx1 {

  public static void main(String[] args) {
    MyFunction1 lambda1 = () ->
      System.out.println(
        "보이드 타입이라 출력밖에 할게 없네, 함수적 인터페이스"
      ); //실행 구문히 하나라면 {} 생략가능
    lambda1.method();
    MyFunction1 lambda2 = () -> {
      int i = 10;
      System.out.println(i * i);
    };
    lambda2.method();

    MyFunction2 lambda3 = x -> System.out.println(x);
    lambda3.method(1523);

    MyFunction3 lambda4 = (x, y) -> x > y ? x : y;
    System.out.println(lambda4.method(10, 15));
  }
}
