package operator;

public class CompareEx1 {

  public static void main(String[] args) {
    // 비교 연산자 결과는 true ot false 로 나옴
    int num1 = 10, num2 = 10;

    System.out.println(num1 == num2);
    System.out.println(num1 != num2);
    System.out.println(num1 >= num2);

    System.out.println("----------");
    //문자도 인코딩이 일어나서 크다, 작다의 개념이 적용가능
    char ch1 = 'A', ch2 = 'B';
    System.out.println(ch1 == ch2); // 65 == 66
    System.out.println(ch1 <= ch2); // 65 <= 66
    System.out.println(ch1 != ch2); // 65 != 66

    System.out.println("----------");

    float f1 = 0.1f;
    double d1 = 0.1d;
    System.out.printf("f1 == d1 = %b\n", f1 == d1); // 0.1을 주었지만 소주점 자리 표현에서 어쩔수없이 0.100000000000000000000000001정도 차이가 들어감
    System.out.printf("f1 == d1 = %b\n", f1 == (float) d1); // 강제 형변환을 주어 소수점 자릿수 표현이 같아지면 true가 뜸
  }
}
