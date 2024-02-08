package inheritance;

// 원(Circle)은 점(Point)이다. => Circle is a Point
// 원(Circle)은 점(Point)을 가지고 있다. => Circle has a Point

// 상속관계 (isa)
// public class Circle extends Point {
//     //int x; // 원점의 x 좌표
//     //int y; // 원점의 y 좌표
//     int r; // 반지름
// }

//  포함관계(hasa) : 한 클래스의 멤버변수로 다른 클래스의 타입의 참조변수를 선언
public class Circle {

  Point p = new Point(); // 멤버변수를 만들면서 Point 클래스를 가져옴
  int r;
}
