package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 스트림 연산
 * 1) 중간연산 : 연산 결과가 스트림인 연산(연속해서 중간 연산 가능)
 *              필터링, 정렬, 그룹핑, ...
 * 2) 최종연산 : 연산 결과가 스트림이 아닌 연산(스트림의 요소를 소모하므로 단 한번만 가능)
 *              합계, 평균, 카운트, 최소값, 최대값, ...
 */
public class StreamEx1 {

  public static void main(String[] args) {
    List<String> strList = Arrays.asList(
      "사과",
      "배",
      "포도",
      "귤",
      "수박",
      "바나나",
      "포도",
      "귤",
      "수박"
    );
    String[] strArr = {
      "비행기",
      "자동차",
      "자전거",
      "버스",
      "오토바이",
      "지하철",
    };

    // 스트림 변환
    Stream<String> stream1 = Arrays.stream(strArr);
    Stream<String> stream2 = strList.stream();

    // 중간연산
    // skip(), limit() : 스트림 자르기
    // stream1.skip(2).forEach(item -> System.out.println(item)); // skip(2) : 시작 2개 건너뛰기
    stream1.skip(2).forEach(System.out::println); // 변수 이름 생각 안해도 돼서 좋을듯
    System.out.println();
    stream2.skip(2).limit(3).forEach(System.out::println); // 시작 2개 건너뛰고 최대 3개만 출력
    System.out.println();

    strList.stream().forEach(System.out::println);
    System.out.println();

    //IllegalStateException: stream has already been operated upon or closed // 닫힌 stream2
    // Arrays.asList() 리스트 생성 시 수정 불가 // UnsupportedOperationException
    // strList.add("파인애플");
    strList.stream().distinct().forEach(System.out::println); // distinct() 중복제거
    System.out.println();
    strList
      .stream()
      .distinct()
      .collect(Collectors.toList())
      .forEach(System.out::println);

    // distinct() : 스트림의 중복 요소 제거 // 나중에 오는 중복값이 사라짐
    IntStream intStream = IntStream.of(1, 2, 4, 3, 4, 3, 3, 5, 6, 5, 5, 6);
    intStream.distinct().forEach(System.out::print);
    System.out.println();

    //filter() : 조건에 맞지 않는 요소 제외
    IntStream intStream2 = IntStream.of(14, 15, 16, 17, 18, 19);
    // 2로 나눈 나머지가 0이 아니고, 3으로 나눈 나머지가 0이 아닌 요소 찾기
    // intStream2
    //   .filter(i -> i % 2 != 0)
    //   .filter(i -> i % 3 != 0)
    //   .forEach(System.out::print);
    intStream2.filter(i -> i % 2 != 0 && i % 3 != 0).forEach(System.out::print);
  }
}
