package array;

public class ArrayEx1 {

  public static void main(String[] args) {
    // 배열(array) : 같은 타입의 변수를 하나의 묶음으로 처리
    // 타입[] 배열명 = new 타입[길이]
    // 배열 선언, 생성하면 초기화까지 일어남.

    // int 타입의 변수가 5개 필요
    int[] arr1 = new int[5]; // 0(byte, short, int, long) 배열선언
    float arr2[] = new float[10]; // 0.0(float, double) // [] 는 int 뒤, 배열명 뒤 올수있음.
    boolean arr3[] = new boolean[2]; // false
    char arr4[] = new char[2]; // ' '

    //int i; 초기화가 필요.

    System.out.println(arr1); //[I@7a81197d ==> 메모리 주소
    System.out.println(arr1[0]); // 배열 값 확인.
    System.out.println(arr2[0]);
    System.out.println(arr3[0]);
    System.out.println(arr4[0]); // 빈칸
  }
}
