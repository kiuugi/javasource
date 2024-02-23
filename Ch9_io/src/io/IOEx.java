package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOEx {

  public static void main(String[] args) {
    // 사용자에게 입력받기 => q 문자열이 입력되면 종료
    // 사용자에게 입력받은 문자파일 (FileWriter, BufferedWriter)에 쓰기
    // 그냥 아무 문자파일에 문자데이터 넣기였음;;

    String str = null;

    try (
      Scanner sc = new Scanner(System.in);
      FileWriter fw = new FileWriter("c:\\temp\\output5.txt");
      BufferedWriter bfw = new BufferedWriter(fw);
    ) {
      System.out.println("파일에 작성할 데이터를 입력하세요.");
      System.out.println("작성 중단 : q");

      do {
        System.out.print(">> ");
        str = sc.nextLine();

        if (!str.equalsIgnoreCase("q")) { // 대소문자 관계없이 q가 아니라면 실행 // 대문자 Q 를 쓰면 밑에 구문은 실행하지 않지만  while 조건에는 안걸려서 계속함.
          bfw.write(str);
          bfw.newLine();
        }
      } while (!str.equals("q")); // 소문자 q 라면 중지
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
