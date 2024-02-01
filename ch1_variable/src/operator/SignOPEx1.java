package operator;

//연산자
// 단항 연산자 : 부호 => 양수, 음수, 증감연산자, 논리부정연산자
// 산술 연산자 : +, -, *, /, %(나머지값)
// 관계(비교) 연산자 : >, < , >=, <=, !=, ==,
// 대입 연산자 : =   // 오른쪽 항의 값을 왼쪽 항으로
// 논리 연산자 : &&(and), ||(or), !(not)
// 비트 연산자, 시프트 연산자
// 조건연산자 : 조건식?,  식1:식2;
// 복합 대입 연산자 :

public class SignOPEx1 {

  public static void main(String[] args) {
    int x = -100;

    int result1 = +x;
    int result2 = -x;
    System.out.printf("result1 = %d, result2 = %d\n", result1, result2);
  }
}
