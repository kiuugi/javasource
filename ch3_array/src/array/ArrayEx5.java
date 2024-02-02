package array;

import java.util.Arrays;

public class ArrayEx5 {

  public static void main(String[] args) {
    // 배열명 arr 선언, 생성 {1,2,3,4,5}
    int arr[] = { 1, 2, 3, 4, 5 };

    //기존 배열의 arr 크기의 2배를 가지는 새로운 배열 생성 tmp
    int tmp[] = new int[arr.length * 2];

    for (int i = 0; i < arr.length; i++) {
      tmp[i] = arr[i];
    }

    int tmp2[] = new int[arr.length * 2];
    System.arraycopy(arr, 0, tmp2, 5, arr.length); //원본, 원본 복사 시작점, 복사받을 배열, 복사받을 위치, 복사할 길이
    System.out.println(Arrays.toString(tmp2));
  }
}
