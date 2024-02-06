package exam;

public class Triangle {

  //밑변(baseLine), 높이(height) // 객체
  private int baseLine;
  private int height;

  //생성자
  public Triangle() {}

  public Triangle(int baseLine, int height) {
    this.baseLine = baseLine;
    this.height = height;
  }

  // 메소드 getArea()
  // 밑변 * 높이 / 2
  double getArea() {
    return (double) baseLine * height / 2; // 변수명 앞에 this. 붙여도 같은 결과가 나오긴함.
  }
}
