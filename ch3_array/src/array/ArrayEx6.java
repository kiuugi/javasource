package array;

public class ArrayEx6 {

  public static void main(String[] args) {
    // 학생 10명의 점수 관리
    int score[] = { 79, 88, 91, 33, 100, 45, 55, 89, 25, 74 };

    // 최고점수 / 최저점수 + 총합 / 평균

    int max = score[0], min = score[0];
    int sum = score[0];
    for (int i = 1; i < score.length; i++) {
      if (score[i] > max) {
        max = score[i];
      }
      if (score[i] < min) {
        min = score[i];
      }
      sum += score[i];
    }
    System.out.println("최고점수 : " + max);
    System.out.println("최소점수 : " + min);
    System.out.println("총합 : " + sum);
    //double avg = sum / (double)score.length; 평균값.
    System.out.println("평균 : " + ((double) sum / score.length));
  }
}
