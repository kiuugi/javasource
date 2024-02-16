package util;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

  public static void main(String[] args) {
    List<Member> list = new ArrayList<>();

    Member member = new Member();
    member.setId("hong123");
    member.setName("홍길동");

    list.add(member);

    Member member2 = new Member();
    member2.setId("Kim123");
    member2.setName("김길동");
    list.add(member2);

    Member member3 = new Member();
    member3.setId("choi123");
    member3.setName("최길동");
    list.add(member3);

    Member member4 = new Member(); // 중복값 상관없음
    member4.setId("choi123");
    member4.setName("최길동");
    list.add(member4);

    for (Member mem : list) {
      // System.out.println(mem); => 오버로딩한 toString() 출력

      System.out.println("ID : " + mem.getId());
      System.out.println("NAME : " + mem.getName());
      System.out.println();
    }
    // for (int i = 0; i < list.size(); i++) {
    //   Member mem = list.get(i);
    //   System.out.println(mem);

    //   System.out.println("ID : " + mem.getId());
    //   System.out.println("NAME : " + mem.getName());
    //   System.out.println();
    // }
  }
}
