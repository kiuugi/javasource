package condition;

// if() {}
public class IfEx4 {

  public static void main(String[] args) {
    //점수가 90 이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 나머지 F
    int score = 75; // 조건이 여러개일때 else if 구문 사용
    char grade; //grade = ' ';  초기화
    if (score >= 90) {
      //  System.out.println("등급은 A 입니다."); // if 구절별고 출력을 다르게 함
      grade = 'A';
    } else if (score >= 80) {
      // System.out.println("등급은 B 입니다.");
      grade = 'B';
    } else if (score >= 70) {
      //  System.out.println("등급은 C 입니다.");
      grade = 'C';
    } else if (score >= 60) {
      //  System.out.println("등급은 D 입니다.");
      grade = 'D';
    } else {
      // System.out.println("등급은 F 입니다.");
      grade = 'F';
    }
    System.out.println("등급은 " + grade + "입니다."); // if 구절에서 바뀌는 부분만 변수로 빼서 실행
    // System.out.printf("등급은 %c 입니다.\n", grade);
    grade = ' '; // 초기화
  }
}
