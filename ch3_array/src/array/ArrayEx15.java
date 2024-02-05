package array;

public class ArrayEx15 {

  public static void main(String[] args) {
    int[][] score = {
      { 100, 95, 98 },
      { 20, 20, 18 },
      { 30, 30, 38 },
      { 40, 55, 45 },
      { 50, 48, 67 },
    };

    // 학생들의 점수 총점과 평균 출력
    // 번호 국어 영어 수학 총점 평균
    //   1  100   95  98  293 97~

    // for (int i = 0; i < score.length; i++) {
    //   for (int j = 0; j < score[i].length; j++) {
    //     num += score[i][j];
    //     System.out.print((i + 1), score[i][j], num, (num / 3));
    //   } // 여기서 너무 다 하려함
    //   System.out.println();
    // }
    int korTotal = 0, engTotal = 0, mathTotal = 0;

    System.out.println("번호    국어    영어    수학     총점    평균");
    System.out.println("=========================================");
    for (int i = 0; i < score.length; i++) {
      System.out.printf("%d\t", (i + 1));

      korTotal += score[i][0];
      engTotal += score[i][1];
      mathTotal += score[i][2];

      int num = 0;
      double avg = 0.0d;

      for (int j = 0; j < score[i].length; j++) {
        num += score[i][j];
        System.out.print(score[i][j] + "\t");
      }
      avg = num / (double) score[i].length;
      System.out.printf("%5d\t%5.1f\n", num, avg);
    }
    System.out.printf("총점    %3d\t%4d\t%4d", korTotal, engTotal, mathTotal);
  }
}
