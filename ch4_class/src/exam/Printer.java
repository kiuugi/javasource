package exam;

public class Printer {

  //메소드 오버로딩 println으로 여러 타입 출력하기
  //타입 기능명 (받는변수) {기능}
  void println(String str) {
    System.out.println(str);
  }

  void println(int i) {
    System.out.println(i);
  }

  void println(double d) {
    System.out.println(d);
  }

  void println(boolean b) {
    System.out.println(b);
  }
  //sout도 메소드이고, 오버로딩이 적용되서 여러 타입을 출력할 수 있는것임.
}
