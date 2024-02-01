package loop;

/*
 *  제어문 - 1. 조건문 2. 반복문
 *  조건문 : 조건에 따라 다음 문장 수행 여부 결정
 *      if, switch
 *  반복문 : 어떤 작업이 반복적으로 수행 되도록 할 때 사용
 *      for , while, do while
 *
 */
public class ForEx1 {

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      // int i = 0; 초기화 (제일 처음만 실행)
      // i < args.length; 조건식 (조건식이 참일 때 까지만 반복)
      // i++ 증감식 (반복문을 제어하는 변수의 값을 증가 혹은 감소시킴.)
    }

    // i can do it. 5번 출력
    for (int i = 0; i < 5; i++) {
      System.out.println("I can do it.");
    }
    // fori 구문 작동순서.
    // 1) int i = 0;
    // 2) i < 5;
    // 3) 반복문 안으로 진입 : sout 실행
    // 4) i++ => i = 1
    // 5) i < 5;
    // 6) 반복문 안으로 진입 : sout 실행
    // 7) i++ => i = 2
    // ..............
    // 8) i++ => 5;
    // 9) i < 5 조건이 false 가 되면 반복문은 종료.

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
    //System.out.println(i); fori 구절에 있는 변수 i는 for 구절의 {} 를 벗어나면 쓸 수 없음.
  }
}
