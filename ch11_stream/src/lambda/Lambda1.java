package lambda;

/*
 * 람다식 (Lambda Expression)
 * 메소드(함수)를 하나의 식으로 표현한 것
 *
 *
 * 반환타입 메소드명(메개변수 선언){}  <= 메소드 선언방식
 * (메개변수 선언)->{} <= 람다식 메소드 선언방식
 * 함수형 인터페이스에서 가능
 */

public class Lambda1 {

  // 메소드 선언 방식(기본)
  int max(int num1, int num2) {
    return num1 > num2 ? num1 : num2;
  }

  // 람다식
  // (int num1, int num2) -> {return num1 > num2 ? num1 : num2;}
  // (int num1, int num2) -> return num1 > num2 ? num1 : num2; // 실행 구문이 하나라면 {} 없이 가능
  // (num1, num2) -> return num1 > num2 ? num1 : num2; // 타입도 유추해서 씀

  void print(String name, int i) {
    System.out.println(name + " = " + i);
  }

  // (name, i) -> System.out.println(name + "=" + i);

  int square(int x) {
    return x * x;
  }

  // (x) -> x * x;

  int roll() {
    return (int) (Math.random() * 6);
  }

  // () -> (int)(Math.random() * 6);

  int sumArr(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    return sum;
  }
  // (int[] arr) -> { // 중괄호 생략 불가
  //     int sum = 0;
  //     for (int i : arr) {
  //         sum += i;
  //     }
  //     return sum;
  // }
}
