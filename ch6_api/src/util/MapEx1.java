package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *  Map 인터페이스
 * - key, value 를 하나의 쌍으로 묶어서 저장
 * - key는 중복불가, value는 중복 가능
 * - 내부 인터페이스 Map.Entry
 * - 구현클래스 : Hashtable, HashMap, TreeMap, ...
 */

public class MapEx1 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>(); //Map<Key, Value>

    // .put() 요소 추가
    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송중기");
    map.put("id_0126", "현빈");

    System.out.println(map);

    System.out.println(
      "key 에 해당하는 value 가져오기 .get() : " + map.get("id_0125")
    );
    System.out.println(
      "key 존재여부 .containsKey() : " + map.containsKey("id_0125")
    );
    System.out.println("map 요소 크기 size() : " + map.size());
    System.out.println("map 요소 삭제 remove() : " + map.remove("id_0125"));

    // 키 값 모두 가져오기
    Set<String> keys = map.keySet(); // map 에 담긴 key 전부 Set 으로 가져오기 / key 값은 중복불가하기 때문에 Set의 개념으로 담음
    System.out.println(keys);

    // value 값 모두 가져오기
    Collection<String> values = map.values(); // map에 담긴 value 전부 Collection으로 가져오기 / value 값은 중복 상관 없기때문에 list, set 의 조상인 Collection에 담아버림
    System.out.println(values);
  }
}
