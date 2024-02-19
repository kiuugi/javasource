package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    map.put("myId", "1234");
    map.put("asdf", "1111");
    map.put("asdf", "1234"); // key 가 중복이라면 나중에 저장한 값이 저장됨

    System.out.println("map : " + map);

    Set<String> keys = map.keySet();
    System.out.println("key : " + keys);

    Collection<String> values = map.values();
    System.out.println("values : " + values); // key 중복 나중값저장

    Scanner sc = new Scanner(System.in);

    // 아이디와 비밀번호를 입력 받아서 맵에 들어있는지 확인
    while (true) {
      System.out.println("아이디와 비밀번호를 입력해 주세요.");
      System.out.print("아이디 : ");
      String id = sc.nextLine().trim();
      System.out.print("비밀번호 : ");
      String password = sc.nextLine().trim();

      // 지금 아이디가 key 값이라 중복 불가 사실상 아이디가 비밀번호 ㄷㄷ;;
      // 키 값 중 아이디와 일치하는지 확인
      if (!map.containsKey(id)) {
        System.out.println("존재하지 않는 아이디");
        continue;
      } else { // else 안에 if문을 넣음 / else if문을 한번 더 써도 똑같음
        // value 값 중 비밀번호가 일치하는지 확인
        if (!map.containsValue(password)) {
          System.out.println("존재하지 않는 비밀번호");
          continue;
        } else {
          System.out.println("로그인 되었습니다.");
          break;
        }
      }
    }
  }
}
