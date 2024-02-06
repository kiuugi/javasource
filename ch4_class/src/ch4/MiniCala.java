package ch4;

public class MiniCala {

  int plus(int x, int y) {
    return x + y;
  }

  double avg(int x, int y) {
    int sum = plus(x, y);
    return (double) sum / 2;
  }

  void execute() {
    println("실행결과 : " + avg(7, 10)); // println 메소드를 불러서 sout 구절을 사용 // avg 메소드를 이용해서 plus 메소드에서 더한 값을 불러오고, 리턴을 만나서 최종 값을 가지고옴
  }

  void println(String message) {
    System.out.println(message);
  }
}
