package operator;

//비트 연산자, 시프트 연산자
//조건연산자 : 조건식? 식1:식2;

public class ConditionEx1 {

  public static void main(String[] args) {
    //x 가 y 보다 크면 x값을 변수가 담고, 그게 아니면 y 값을 담기
    int x = 5, y = 3;
    int result = (x >= y) ? x : y;
    System.out.printf("result = %d\n", result);

    //점수가 90 이상이면 A, 그 외는 F
    int score = 80;
    System.out.println(score >= 90 ? 'A' : 'F');

    //점수가 90 이상이면 A, 90 이상이면 B, 그 외는 F
    System.out.println(score >= 90 ? 'A' : (score >= 80 ? 'B' : 'F'));
  }
}
