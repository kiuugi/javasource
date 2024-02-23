package lambda;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * 메서드 참조
 * 람다식을 더 간결하게 사용
 * 람다식이 하나의 메소드만 호출하는 경우
 * 클래스이름::메소드명
 */
public class LambdaEx6 {

  public static void main(String[] args) {
    // "5698" ==> 5698 + 30 ==> 5728 리턴
    //Function<String, Integer> function2 = s -> Integer.parseInt(s);
    Function<String, Integer> function2 = Integer::parseInt;
    System.out.println(function2.apply("5698"));

    // 두개의 문자열을 받아서 문자열이 동일한지 리턴
    // BiFunction<String, String, Boolean> f1 = (s1,s2) -> s1.equals(s2);
    BiFunction<String, String, Boolean> f1 = String::equals; // String클래스의 equals 메소드 사용해줘 변수 s1, s2 위치는 자동지정

    //Supplier<Student> s = () -> new Student();
    Supplier<Student> s = Student::new;
  }
}
