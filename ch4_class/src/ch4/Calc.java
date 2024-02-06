package ch4;

public class Calc {

  // 직사각형, 정사각형 넓이 // 하려고 하는 일은 동일한데 안에서 처리해야하는 일이 조금 다를때
  double areaRectangle(double width) {
    //정사각형
    return width * width;
  }

  double areaRectangle(double width, double height) {
    //직사각형
    return width * height;
  }
}
