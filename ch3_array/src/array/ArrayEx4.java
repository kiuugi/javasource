package array;

import java.util.Arrays;

public class ArrayEx4 {

  public static void main(String[] args) {
    // 'a', 'b', 'c', 'd' char 1차원 선언, 생성

    char[] chArr = { 'a', 'b', 'c', 'd' };
    System.out.println(chArr); // abcd / 문자만 특이하게 문자가 출력됨

    int intArr[] = { 78, 88, 9, 86, 55 };
    System.out.println(intArr); // 주소값
    System.out.println(Arrays.toString(intArr)); //[ 78, 88, 9, 86, 55 ]

    // 배열복사
    // 더 큰 배열을 생성 => 기존 배열 새로운 배열에 복사
    int temp[] = new int[intArr.length * 2]; // 위의 intArr 배열의 길이가 5 이기 때문에 5 * 2 == 10 길이의 배열 생성

    // for (int i = 0; i < temp.length; i++) {
    //   temp[i] = intArr[i];
    // }
    // intArr = temp;

    for (int i = 0; i < intArr.length; i++) {
      temp[i] = intArr[i];
    }
    intArr = temp;
    System.out.println("복사 후 " + Arrays.toString(intArr)); //에러 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 // 이건 박복조건이 잘못됨
    // "abc", "def", "hij", "apple"
    String strArr[] = { "abc", "def", "hij", "apple" }; //주소값
    System.out.println(strArr);
    System.out.println(Arrays.toString(strArr)); // ["abc", "def", "hij", "apple"]
  }
}
