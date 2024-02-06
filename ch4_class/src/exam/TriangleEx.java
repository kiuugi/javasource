package exam;

public class TriangleEx {

  public static void main(String[] args) {
    Triangle triangle = new Triangle(33, 43);
    double result = triangle.getArea();
    System.out.println("삼각형 면적 : " + result);
  }
}
