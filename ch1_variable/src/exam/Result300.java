package exam;

public class Result300 {

  public static void main(String[] args) {
    int value = 356;

    //출력 결과가 300이 나올 수 있도록 산술 연산 기호 사용
    System.out.printf("value = %d", (value / 300) * 300);

    int num = 24;
    // 변수 num 의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num 의 값을 나머지를 구하시오.
    // 예 24의 크면서도 가장 가까운 10의 배수는 30이고, 19는 20, 81은 90이다.
    int i1 = ((num + 10) / 10) * 10;
    int result1 = i1 - num;
    System.out.println(result1);

    System.out.println(10 - (num % 10));

    int num2 = 333;
    //num2의 값 중에서 일의 자리를 1로 바꾸는 프로그램 작성
    //예를 들어 num의 값이 333 이라면 331 이 되고, 777 이라면 771이 된다.
    //int i2 = (num / );
    //int result2 =  ;
    // System.out.println(result2);
    System.out.println(num2 / 10 * 10 + 1);
  }
}
