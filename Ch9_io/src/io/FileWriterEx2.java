package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class FileWriterEx2 {

  public static void main(String[] args) {
    // 현재 폴더에서 자바소스 읽은 후 다른 파일에 출력

    // FileEx1.java 읽기 ==> D:\source\javasource\Ch9_io\src\io\FileEx1.java ==>.\src\io\FileEx1.java
    // c:\\temp\\output2.txt 출력

    try (
      Reader fr = new FileReader(
        ".\\src\\io\\FileEx1.java",
        Charset.forName("UTF-8") // Charset.forName(읽는방법) 명시해줘야 한글이 안꺠짐
      );
      Writer fw = new FileWriter("c:\\temp\\output2.txt");
    ) {
      int data = 0;
      char[] cbuf = new char[8192]; // 배열은 안써도 fw.write() 로 가능하지만 컴퓨터가 읽고 쓰는 속도를 약간이라고 올리려면 배열을 쓰는것이 좋다.
      while ((data = fr.read(cbuf)) != -1) {
        fw.write(new String(cbuf));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
