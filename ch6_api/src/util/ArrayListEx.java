package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* 컬랙션 프레임워크 : 데이터 군을 저장하는 클래스들을 표준화한 설계
 * Collection
 * List    Set(Collection 인터페이스 상속)
 *
 * Map
 *
 * List(인터페이스) : 순서가 있는 데이터의 집합(데이터의 중복 허용)
 *  구현 클래스 - ArratList, Linkedlist, Stack, Vector, ...;
 *  고정 크기 => 크기 변경이 필요하다면 내부적으로 알아서 처리해줌
 *
 * ==> 배열과 동일한 개념으로 작동함
 *     고정크기 => 크기 변경시 다른 배열 생성 후 옮겨야 함
 *
 */

public class ArrayListEx {

  public static void main(String[] args) {
    // 아무것도() 안넣으면 initial capacity : 10  // == new [10]
    List<Integer> list = new ArrayList<>(20); // <객체타입밖에 담지 못함>
    // List 는 인터페이스 클래스 라서 자식 자리에 못옴. 부모로는 올 수 있음.
    list.add(75);
    list.add(68);
    list.add(35);
    list.add(45);
    list.add(55);
    list.add(65);

    System.out.println(list); //오버라이딩 여부 확인

    // 정렬 sort
    list.sort(Comparator.reverseOrder()); // 내림차순 정렬
    list.sort(Comparator.naturalOrder()); // 오름차순
    System.out.println(list);
    list.add(0, 77); // 특정 위치에 객체 추가
    System.out.println(list);

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("Java"); // append 개념(뒤에추가)
    list2.add("JSP");
    list2.add("HTML");
    list2.add("CSS");
    list2.add("JAVASCRIPT");
    list2.add("PYTHON");

    System.out.println(list2);

    // 메소드
    // arr.length
    System.out.println(list2.size()); // ArrayList 에 저장된 객체 개수 / 배열에서 .length 같음
    // arr[3]
    System.out.println(list2.get(3)); // 지정된 위치에 있는 객체 반환 // 배열의 [3] 같은 역할
    System.out.println("indexOf() " + list2.indexOf("JAVA")); // 지정된 객체가 저장된 위치 반환
    System.out.println("remove() " + list2.remove("Java")); // 지정된 객체 제거 / boolean값으로 반환
    System.out.println(list2);
    System.out.println("remove() " + list2.remove(2)); // String 값으로 제거되는 객체가 반환
    System.out.println(list2);

    // ArrayList ==> 배열로 변환
    Object[] arr = list2.toArray();
    for (Object Object : arr) {
      System.out.println(Object);
    }

    // 배열 ==> ArrayList 변환
    // Arrays 클래스 사용
    int arr2[] = { 3, 5, 6, 7, 9 };
    List<int[]> list3 = Arrays.asList(arr2);

    System.out.println(list2);
    System.out.println("isEmpty() " + list2.isEmpty()); // ArrayList가 비어 있는지 확인
    list2.set(1, "Oracle"); // 특정 위치에 객체 수정
    System.out.println(list2);
  }
}
