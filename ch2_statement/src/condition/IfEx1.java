package condition;

/*
 *  제어문 - 1. 조건문 2. 반복문
 *  조건문 : 조건에 따라 다음 문장 수행 여부 결정
 *      if, switch
 *  반복문 : 어떤 작업이 반복적으로 수행 되도록 할 때 사용
 *      for , while, do while
 */

public class IfEx1 {

  public static void main(String[] args) {
    //if (조건식(비교연산자, 논리연산자 등 true나 false 로 나오는 값)) { 조건식이 참일때 수행될 문장들 나열 }
    // {} 생략 : if문 조건식이 참일때 수행할 구문이 하나일때 가능
    int x = 0;
    if (x == 0) {
      System.out.println("x == 0");
    }
    if (x != 0) {
      System.out.println("x != 0");
    }
    if (!(x == 0)) { // ! == not
      System.out.println("x != 0");
    }
    if (!(x != 0)) System.out.println("!(x != 0)"); // {} 생략  (; 위치혼동주의)
  }
}
