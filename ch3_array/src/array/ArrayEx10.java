package array;

import java.util.Arrays;

// 정렬
// 알고리즘 - 정렬
//           선택정렬, 버블정렬

public class ArrayEx10 {

  public static void main(String[] args) {
    int arr[] = { 25, 85, 55, 65, 5, 3 };
    int temp = 0;

    // 자바가 제공하는 sort 방법
    Arrays.sort(arr); // 오름차순 sort
    System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] < arr[j]) { // arr[i]가 자릿값이니까 arr[i]가 arr[j]보다 작을때 변환이 이루어지도록 함.
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
