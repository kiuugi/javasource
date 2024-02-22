package io;

import java.io.FileWriter;

public class FileWriterEx1 {

  // \r \n (CRLF) // 텍스트 문서에서의 엔터개념
  // \r(CR : 캐리지리턴)
  // \n(LF : 라인피드)
  public static void main(String[] args) {
    try (FileWriter fw = new FileWriter("c:\\temp\\output1.txt", true)) { // true : 지금 있는 파일 뒤에 이어쓰기
      fw.write("FileWriter 는 한글로 작성된\r\n");
      fw.write("문자열을 바로 출력할 수 있다.\r\n");
      fw.write("Writer 클래스는 문자 단위의\r\n");
      fw.write("출력만 가능합니다. 바이트 단위의 그림과 영상은 불가능하다.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
