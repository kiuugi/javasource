package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx3 {

  public static void main(String[] args) {
    // Member 사용자 입력 받아서 ArratList 구현

    List<Member> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      System.out.print("아이디 입력 : ");
      String id = sc.nextLine();

      System.out.print("이름 입력 : ");
      String name = sc.nextLine();

      Member member = new Member(); // 객체 하나 만들때마다 생성자가 하나씩 들어가야해서 생성자도 for 구문 안에 있어야함

      member.setId(id);
      member.setName(name);

      list.add(member);
    }

    for (Member mem : list) {
      System.out.println(mem);
    }
  }
}
