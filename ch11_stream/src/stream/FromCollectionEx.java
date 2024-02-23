package stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lambda.Student;

public class FromCollectionEx {

  static int sum = 0;

  public static void main(String[] args) {
    List<Student> students = Arrays.asList(
      new Student("홍길동", 90, 80),
      new Student("강호동", 90, 70),
      new Student("송진호", 70, 60)
    );

    // Stream 객체 변환
    Stream<Student> stream = students.stream();
    stream.forEach(student -> //student는 그냥 여기서 쓰는 새로운 변수 위는 s 붙음
      System.out.println(
        student.getName() + " : " + student.getKor() + " : " + student.getMath()
      )
    );
    // stream.forEach(student -> {
    //     //처리해야할 코드가 많은 경우
    // }
    //java.nio.file.Path : nio == io 패키지를 향상키켰다
    Path path = Paths.get("c:\\temp");

    try (Stream<Path> stream2 = Files.list(path);) {
      // 파일명 출력
      stream2.forEach(file -> System.out.println(file.getFileName())); // temp에 있는 모든 파일 이름 출력
    } catch (Exception e) {
      e.printStackTrace();
    }

    // 1 ~ 100까지의 합
    // int sum = 0;
    // for (int i = 1; i < 101; i++) {
    //   sum += i;
    // }
    // System.out.println("1~100 합 : " + sum);

    // 특정 범위의 정수를 스트림으로 생성 // Exclusive 미포함
    IntStream.range(0, 10).forEach(i -> System.out.print(i + " "));
    System.out.println();
    IntStream.rangeClosed(0, 10).forEach(i -> System.out.print(i + " "));

    IntStream.rangeClosed(1, 100).forEach(i -> sum += i);
    System.out.println("\n1~100까지 더한 수 sum : " + sum);
  }
}
