package stream;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import lambda.Student;

public class StreamEx2 {

  public static void main(String[] args) {
    List<File> list = Arrays.asList(
      new File("Ex1.java"),
      new File("Ex2"),
      new File("Ex3.bak"),
      new File("Ex4.java"),
      new File("Ex5.txt")
    );

    Set<String> exSet = new HashSet<>();

    // 파일명 추출하기 + 확장자만 출력 (중복제거)
    for (File file : list) {
      System.out.println(file.getName());
      String fileName = file.getName();
      if (fileName.lastIndexOf(".") != -1) {
        String ext = fileName.substring(fileName.indexOf(".") + 1);
        exSet.add(ext);
      }
    }
    System.out.println(exSet);

    System.out.println();

    // Stream으로
    // Stream<File> stream = list.stream();
    Stream<File> stream = Stream.of(
      new File("Ex1.java"),
      new File("Ex2"),
      new File("Ex3.bak"),
      new File("Ex4.java"),
      new File("Ex5.txt")
    );

    // map() : 스트림의 요소에 저장된 값 중에서 원하는 필드만 추출하거나 특정 형태로 변환하는 경우 사용
    // 파일의 스트림에서 이름 추출한 후 출력
    // stream.map(f -> f.getName()).forEach(f -> System.out.println(f));
    // stream.map(File::getName).forEach(System.out::println);

    // 파일의 스트림에서 이름 추출한 후 확장자만 추출(중복 제거한 후 확장자 출력)
    stream
      .map(File::getName) // 파일 이름만 추출
      .filter(s -> s.lastIndexOf(".") != -1) // 확장자 없는 파일 거르기
      .peek(s -> System.out.printf("fileName = %s\n", s)) // 필터링 결과 중간확인
      .map(s -> s.substring(s.lastIndexOf(".") + 1)) // 확장자만 추출
      .peek(s -> System.out.printf("ext = %s\n", s))
      .distinct() // 중복제거
      .forEach(System.out::println); // 출력

    System.out.println();

    Stream<String> stream2 = Stream.of(
      "바둑",
      "바나나",
      "포도",
      "딸기",
      "바질",
      "강아지",
      "고양이"
    );
    // '바' 로 시작하는 문자열 추출
    stream2.filter(s -> s.startsWith("바")).forEach(System.out::println);

    System.out.println();

    Stream<Student> stream3 = Stream.of(
      new Student("홍길동", 90, 80),
      new Student("송중기", 85, 70),
      new Student("김지원", 92, 81),
      new Student("정우성", 88, 87),
      new Student("송혜교", 68, 79)
    );
    // 이름만 출력
    // stream3.map(s -> s.getName()).forEach(System.out::println);

    // '송' 으로 시작하는 이름 출력
    // stream3
    //   .map(s -> s.getName())
    //   .filter(s -> s.startsWith("송"))
    //   .forEach(System.out::println); // 송중기, 송혜교

    stream3
      .filter(s -> s.getName().startsWith("송"))
      .forEach(System.out::println); // Student(name=송중기, math=85, kor=70), Student(name=송혜교, math=68, kor=79)
    // peek : 조회 - 연산과 연산 사이에 올바르게 처리되었는지 확인
    //               forEach 는 최종연산이기 때문에 스트림이 소모됨 => 확인용으로 peek 사용
  }
}
