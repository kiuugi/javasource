package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;

// 2. 문자 기반 스트림(문자)
//      Reader(추상)
//      Writer(추상)

// Charset 표준
// ISO-8859-1, UTF8, UTF16
//윈도우즈 MS949
public class ReaderEx1 {

  public static void main(String[] args) {
    //Reader reader = null;
    //Writer writer = null;
    try (
      Reader reader = new FileReader(
        "c:\\temp\\file1.txt",
        Charset.forName("utf-8")
      );
      Writer writer = new FileWriter("c:\\temp\\test1.txt");
    ) {
      //reader = new FileReader("c:\\temp\\file1.txt", Charset.forName("utf-8"));
      // reader.read(); 하나의 문자 읽어오기
      // reader.read(char[] cbuf); 입력소스로부터 배열의 크기만큼 읽어서 배열에 저장
      // reader.read(char[] cbuf, int off, int len);  입력소스로부터 len개 만큼 읽어서 배열의 off위치에 저장
      //writer = new FileWriter("c:\\temp\\test1.txt");
      // writer.write(String str);
      // writer.write(int ch);
      // writer.write(char[] cbuf);

      int data = 0;
      char[] cbuf = new char[1024];
      while ((data = reader.read(cbuf)) != -1) {
        //System.out.print((char) data);
        // writer.write(cbuf);
        // String str = Arrays.toString(cbuf); 이렇게바꾸면 그냥 찍을때 ',' 같이찍힘
        writer.write(new String(cbuf));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
