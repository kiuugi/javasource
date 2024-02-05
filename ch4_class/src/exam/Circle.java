package exam;

public class Circle {

  //반지름(3.5) - radius
  private double radius;

  //   public Circle() {}

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle() {
    //TODO Auto-generated constructor stub // 큌 픽스로 자동 생성된 문장
  }

  //반지름 * 반지름 * 3.14 결과값 리턴 // 원 면적
  double getArea() {
    return this.radius * this.radius * 3.14;
  }
}
