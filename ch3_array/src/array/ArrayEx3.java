package array;

public class ArrayEx3 {

  public static void main(String[] args) {
    // 배열의 초기값 변경 -- 초기값은 0 , 나중에 값을 넣는 방식.
    // score[0] = 98;
    // score[1] = 88;
    // score[2] = 78;
    // score[3] = 68;
    // score[4] = 58;

    // 배열 초기값이 정해진 경우
    int score[] = new int[] { 98, 88, 78, 68, 58 }; // 이경우 []안에 숫자가 들어오면 안됨.
    int score2[] = { 98, 88, 78, 68, 58 }; // 배열 초기값이 정해졌을경우 가장 자주쓰는 형태

    // 배열 사이즈 변경 가능? => 처음에 생성된 크기 변경하는 건 불가능
    // 더 큰 배열을 생성 => 기존 배열을 새로운 배열에 복사.

    //대괄호 [] 하나인 배열을 1차원 배열
    int score3[][] = { { 78, 98 }, { 88, 68 } }; // 2행 2열 짜리 표/ 2차원 배열
    //0-0, 0-1, 1-0, 1-1
    for (int i = 0; i < score3.length; i++) {
      for (int j = 0; j < score3[i].length; j++) {
        System.out.print(score3[i][j] + "\t");
      }
      System.out.println();
    }

    System.out.println();

    for (int[] arr : score3) {
      for (int num : arr) {
        System.out.print(num + "\t");
      }
      System.out.println();
    }
  }
}
