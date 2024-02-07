package ch4;

import java.util.Scanner;

public class StudentEx4 {

  public static void main(String[] args) {
    Student3 strArr[] = new Student3[3];

    System.out.println(strArr[0]); // 클래스 배열 초기값 : null
    //System.out.println(strArr[0].getId()); // NullPointerException : strArr[] 주소 공간만 잡아놨을 뿐 상세 데이터가 없음 // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "ch4.Student3.getId()" because "strArr[0]" is null

    Scanner sc = new Scanner(System.in); // Scanner 클래스 생성
    for (int i = 0; i < strArr.length; i++) {
      strArr[i] = new Student3(); // Student3 strArr[] = new Student3[3]; 이 구문으로 null로 생성되었던 공간에 데이터를 집어넣음

      System.out.println("Input id : ");
      String id = sc.nextLine(); // Scanner클래스 안에있는 nextLine()메소드를 호출
      strArr[i].setId(id);

      System.out.println("Input name : ");
      String name = sc.nextLine();
      strArr[i].setName(name);

      System.out.println("Input 국어점수 : ");
      int kor = Integer.parseInt(sc.nextLine()); // sc.nextInt는 enter를 쳐도 못알아듣다가 다음 nextLine을 만났을때 못알아들었던 enter에 반응해서 바로 다음 스캐너로 넘어감.
      strArr[i].setKor(kor);

      System.out.println("Input 수학점수 : ");
      int math = Integer.parseInt(sc.nextLine());
      strArr[i].setMath(math);

      System.out.println("Input 영어점수 : ");
      int eng = Integer.parseInt(sc.nextLine());
      strArr[i].setEng(eng);
    }

    System.out.println("========================================");
    System.out.println("아이디  이름  국어  영어  수학  총점  평균");
    System.out.println("========================================");

    for (Student3 student3 : strArr) {
      // int i = 0; i < strArr.length; i++
      // Student3 student3 = stuArr[i]; == foreach 문

      //System.out.println(student3); == student3.toString()
      //모든 학생들의 정보 접근
      //System.out.println(student3.getId() + "  " + student3.getName() + "  " + student3.getKor() + "  " + student3.getEng() + "  " + student3.getMath());
      int sum = student3.getEng() + student3.getKor() + student3.getMath();
      double avg = sum / 3.0;
      System.out.printf(
        "%s  %s  %d  %d  %d  %d  %5.2f\n",
        student3.getId(),
        student3.getName(),
        student3.getKor(),
        student3.getEng(),
        student3.getMath(),
        sum,
        avg
      );
    }
    System.out.println("================================");
    for (int i = 0; i < strArr.length; i++) {
      int sum = strArr[i].getEng() + strArr[i].getKor() + strArr[i].getMath();
      double avg = sum / 3.0;
      System.out.printf(
        "%s  %s  %d  %d  %d  %d  %5.2f\n",
        strArr[i].getId(),
        strArr[i].getName(),
        strArr[i].getKor(),
        strArr[i].getEng(),
        strArr[i].getMath(),
        sum,
        avg
      );
    }
  }
}
