package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx8 {

  public static void main(String[] args) {
    // 45 개의 정수값을 저장하기 위한 배열 생성
    // 1~ 45 담기 : for
    int[] arr = new int[45];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    System.out.println(Arrays.toString(arr));

    //0번 자리에서 5번 자리만 교환
    int temp = 0;
    for (int i = 0; i < 6; i++) { // i : 자리를 바꿀 대상
      //무작위 숫자 0~ 44
      int pos = (int) (Math.random() * 45);
      temp = arr[i];
      arr[i] = arr[pos];
      arr[pos] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
