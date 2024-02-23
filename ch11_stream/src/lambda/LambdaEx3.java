package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * java.util,function 패키지
 * 함수형 인터페이스 제공 => 직접 만들 필요가 없음
 *
 * 메소드  // R == 리턴값
 * 매개변수 없고, 반환값도 없음 : void run() ==> java.lang.Runnable
 * 매개변수 없고, 반환값이 있음 : int run() ==> Supplier<T>  T get()
 * 매개변수 있고, 반환값이 없음 : void run(int x) ==> Consumer<T>  void accept(T t)
 * 매개변수 있고, 반환값도 있음 : int run(int x) ==> Funtion<T, R>  R apply(T t)
 * 조건식 표현할 때 사용되는 메소드 : boolean test(int x) ==> Predicate<T>  boolean test(T t)
 *  매개변수의 타입이 뭐가 들어올지 모르니까 <T> 객체값으로 전부 해결함
 *
 * Bi~~ : 매개변수의 개수가 2개인 함수형 인터페이스
 * 매개변수가 2개인 함수형 인터페이스. ==> BiConsumer<T, U> void accept(T t, U u)
 * int run(int x, float f) ==> BiFuntion<T, U, R>  R apply(T t, U u)
 * boolean test(int x, double y) ==> Predicate<T, U>  boolean test(T t, U u)
 *
 * Function 과 같은 역할
 * 매개변수 타입과 반환 타입이 모두 일치한다.
 * UnaryOperator<T>  T apply(T t)
 * BinaryOperator<T>  T apply(T t, T u)
 *
 * 기본형을 이용하는 함수형 인터페이스
 * ToIntFunction => int applyAsInt(T value)
 */

public class LambdaEx3 {

  public static void main(String[] args) {
    // lambda식을 쓰기위해 java에서 만들어놓은 함수형 인터페이스를 씀
    Supplier<Integer> supplier = () -> (int) (Math.random() * 100) + 1; // java에서 지원하는 함수형 인터페이스를 생성하고 만듬.
    System.out.println("1~100 임의의 수 : " + supplier.get()); // 만든 함수형 인터페이스를 호출

    Consumer<Integer> consumer = i -> System.out.println(i);
    consumer.accept(10);

    Function<Integer, Integer> function = i -> i / 10 * 10;
    System.out.println(function.apply(150));

    Predicate<Integer> predicate = i -> i % 2 == 0;
    System.out.println(predicate.test(10));

    // "5698" ==> 5698 + 30 ==> 5728 리턴
    Function<String, Integer> function2 = s -> Integer.parseInt(s) + 30;
    System.out.println(function2.apply("5698"));

    // 문자열의 길이가 0인지 판별
    Predicate<String> predicate2 = s2 -> s2.length() == 0;
    System.out.println(predicate2.test("문자열"));

    // 문자열 리턴
    Supplier<String> supplier2 = () -> "안녕하세요";
    System.out.println(supplier2.get());

    // 문자열을 받아서 문자열 출력
    Consumer<String> consumer2 = s3 -> System.out.println(s3);
    consumer2.accept("문자열을 받아서 문자열 출력");

    // 두개의 숫자를 받아서 더하기 한 후 리턴
    BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;
    System.out.println(biFunction.apply(50, 75));

    // 두개의 숫자를 받아서 큰 값 출력하기
    BiConsumer<Integer, Integer> biConsumer = (x, y) ->
      System.out.println(x > y ? x : y);
    biConsumer.accept(10, 15);

    // 두개의 String 을 받아서 하나의 문자열로 리턴
    BiFunction<String, String, String> biFunction2 = (str1, str2) ->
      str1.concat(str2);
    // str1 + " " + str2;
    System.out.println(biFunction2.apply("Hello", " World"));
  }
}
