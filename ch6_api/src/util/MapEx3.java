package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx3 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>(); //Map<Key, Value>

    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송중기");
    map.put("id_0126", "현빈");

    // Iterator 사용 시
    // 키 값만 모두 가져오기
    Set<String> set = map.keySet();
    // 키 값을 Iterator 구조로 변경
    Iterator<String> iterator = set.iterator();

    while (iterator.hasNext()) {
      String key = iterator.next();
      String value = map.get(key);
      System.out.println(key + " : " + value);
    }

    System.out.println();

    // Map => Map.Entry 내부 인터페이스로 가지고 있음
    // Map.Entry 구조로 받아오고 그걸 다시 Set 구조로 받아옴.
    Set<Entry<String, String>> enteries = map.entrySet(); // map 구조의 key,value를 하나의 데이터로 움직이는 방법,

    Iterator<Entry<String, String>> iterator2 = enteries.iterator();
    while (iterator2.hasNext()) {
      Entry<String, String> entry = iterator2.next();
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    System.out.println(enteries);
  }
}
