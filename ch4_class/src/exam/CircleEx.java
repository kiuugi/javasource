package exam;

import java.util.Scanner;

//선언된 생성자가 하나도 없다면 컴파일러는 default 생성자를 만들어 줌
public class CircleEx {

  public static void main(String[] args) {
    Circle circle = new Circle();

    Scanner sc = new Scanner(System.in);
    System.out.print("반지름 : ");

    Circle circle1 = new Circle(sc.nextDouble());

    //원의 면적 구하는 메소드 호출
    double result = circle1.getArea();
    System.out.println("원의 면적 : " + result);
  }
}
