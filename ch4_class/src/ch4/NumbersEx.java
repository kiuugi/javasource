package ch4;

public class NumbersEx {

  public static void main(String[] args) {
    int num[] = { 10, 15, 25, 35, 45 }; // 앞의 클래스가 배열이기 때문에 배열을 만들어서 넘김.

    Numbers numbers = new Numbers(num);
    System.out.println("총합 : " + numbers.getTotal());
    System.out.println("평균 : " + numbers.getAverage());
  }
}
