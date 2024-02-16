package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();

    // 1~45 사이의 숫자를 임의로 생성

    for (int i = 0; set.size() < 6; i++) { // 조건을 set.size() 로 잡아서 중복이 나와서 숫자를 저장 못하면 size()가 6이 될때까지 반복시킴
      int num = (int) (Math.random() * 45) + 1;
      set.add(num);
    }
    System.out.println(set);
    // set ==> List
    List<Integer> list = new ArrayList<>(set);
    list.sort(Comparator.naturalOrder());
    System.out.println(list);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(35);
    list2.add(45);
    list2.add(55);
    list2.add(55);

    Set<Integer> set2 = new HashSet<>(list2);
    System.out.println(set2);

    // 중복을 판별하기 위한 코드 필요
    // equals(), hashCode() 오버라이딩 해야함
    Set<Member> set3 = new HashSet<>();

    Member member = new Member();
    member.setId("hong123");
    member.setName("홍길동");

    set3.add(member);

    member = new Member();
    member.setId("hong123");
    member.setName("홍길동");

    set3.add(member);

    for (Member mem : set3) {
      System.out.println(mem);
    }
  }
}
