package exam;

public class Pencil {

  public static void main(String[] args) {
    //534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌때 학생 한 명 당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지 출력하시오
    int i = 534;
    int a = 30;
    int x = i / a;
    int y = i % a;
    System.out.println(i / a);
    System.out.println(i % a);
    System.out.println(
      "학생 한명 당 " + x + "자루 만큼 가질 수 있고, " + y + "자루 만큼 남는다."
    );
  }
}
