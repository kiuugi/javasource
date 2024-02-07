package ch4;

public class ReferenceParam {

  public static void main(String[] args) {
    int[] x = { 10 }; // 배열도 주소값을 가지고, heap 에 생성
    System.out.println("main () : x[0] = " + x[0]);
    change(x); // chang 호출
    System.out.println("change () 호출 후 main () : x[0] = " + x[0]);
  }

  public static void change(int[] x) { // 배열도 참조형이다. // 주소를 받았으니 원본수정 가능
    x[0] = 1000;
    System.out.println("change () : x = " + x[0]);
  }
}
