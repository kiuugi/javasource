package exam;

public class Area {

  public static void main(String[] args) {
    //사다리꼴의 넓이를 구한 후 출력
    // 윗변 + 아랫변 * 높이 / 2
    // 소수점 2자리까지 출력
    int x = 7;
    int y = 10;
    int z = 3;
    double result = (x + y) * z / 2.0; // casting / double로 바꿔주기 상수를 double로 바꾸는건 상수.0을 써서 소수점 자릿수를 표현해주면 됨, or 앞에 (double)을 써서 int 변수를 double 타입으로 바꿔줌
    System.out.printf("사다리꼴 넓이 : %.2f", result);
  }
}
