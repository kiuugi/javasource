package ch1;

/* 기본 타입(primitive type)
 *  정수형, 실수형, 불린형, 문자형
 *  선언 후 초기화가 반드시 필요함
 *
 * 인코딩  (ASCII, 유니코드(UTF-8, UTF-16))
 *  A => 65  인코딩 : 문자를 컴퓨터가 이해하는 코드로 바꾸는것
 *
 * 디코딩
 *  65 => A  디코딩 : 숫자를 문자로 다시 바꾸는것
 */

public class VarByteEx1 {

  public static void main(String[] args) {
    // 타입(자료형) 변수명(소문자로 시작/두 개의 단어가 합해진 변수명은 두번째 단어 시작을 대문자로 함)
    //1. 정수형 - byte(1byte), short(2byte), int(4byte), long(8byte)
    byte age = 10, maxSpeed = 10;
    short age1 = 10, maxSpeed1 = 10; // 변수 이름은 중복 불가능
    int age2 = 15, maxSpeed2 = 20;
    // long타입은 값에 L(l) 붙이기 , 자바 내부적으로 변환하여 정수타입은 int로 변환하여 사용하기 때문에 int 범위를 넘어가는 숫자는 뒤에 L 을 붙여야함.
    long age3 = 123456789, maxSpeed3 = 1000000000000L; //숫자 뒤 L은 소문자 l도 가능하지만 가독성을 위해 대문자로 사용

    age = 33;
    //age = 128; Type mismatch: cannot convert from int to byteJava(16777233) byte로 담기에는 너무 큰 값
    System.out.println(age + maxSpeed); // 정수 + 정수 라서 수식으로처리
    System.out.println(age + " , " + maxSpeed); // + 연결해서 출력해줘
    System.out.println("나이 : " + age1 + ", 최고속도 : " + maxSpeed1);
    System.out.println("나이 : " + age2 + ", 최고속도 : " + maxSpeed2);
    System.out.println("나이 : " + age3 + ", 최고속도 : " + maxSpeed3);
  }
}
