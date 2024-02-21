package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {

  public static void main(String[] args) {
    // 파일에 들어있는 내용 읽어오기
    InputStream in = null; // 입력 => 연결할 대상
    OutputStream out = null; //출력 => 출력할 장소

    try { // 파일을 못찾을경우 대비해서
      // 연결
      in = new FileInputStream(new File("c:\\temp\\file1.txt"));
      //   out = System.out;
      out = new FileOutputStream("c:\\temp\\file1_copy.txt"); // 화면이 아니라 c:\\temp\\file1_copy.txt 파일을 만들어서 출력

      //읽어오기
      int data = 0; // 한 byte씩 읽어오기 => 한글은 깨짐
      byte[] b = new byte[1024]; // byte를 배열로 만듬, => 똑같이 한글은 깨짐
      while ((data = in.read(b)) != -1) {
        out.write(b);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        in.close();
        out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
