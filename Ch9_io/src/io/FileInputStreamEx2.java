package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx2 {

  public static void main(String[] args) {
    // 파일에 들어있는 내용 읽어오기
    // InputStream in = null; // 입력 => 연결할 대상
    // OutputStream out = null; //출력 => 출력할 장소

    // try { // 파일을 못찾을경우 대비해서
    //   // 연결
    //   in = new FileInputStream(new File("c:\\temp\\kbs_1.mp4")); // in file => 파일을 읽어와서 out file => 파일로 출력함
    //   //   out = System.out;
    //   out = new FileOutputStream("c:\\temp\\kbs_1_copy.mp4"); // 화면이 아니라 c:\\temp\\file1_copy.txt 파일을 만들어서 출력

    //   //읽어오기
    //   int data = 0; // 한 byte씩 읽어오기 => 한글은 깨짐
    //   byte[] b = new byte[1024]; // byte를 배열로 만듬, => 똑같이 한글은 깨짐
    //   while ((data = in.read(b)) != -1) {
    //     out.write(b);
    //   }
    // } catch (FileNotFoundException e) {
    //   e.printStackTrace();
    // } catch (IOException e) {
    //   e.printStackTrace();
    // } finally {
    //   try {
    //     in.close();
    //     out.close();
    //   } catch (IOException e) {
    //     e.printStackTrace();
    //   }
    // }

    // try - with - resources : try() 닫아야 할 자원들을 선언하면 자동으로 닫아줌
    try (
      InputStream in = new FileInputStream(new File("c:\\temp\\file1.txt")); // 이 파일 안에들어있는걸 읽어오겠다
      OutputStream out = new FileOutputStream("c:\\temp\\file1_copy.txt"); // 이 파일 안에다 읽은것을 쓰겠다. 적을것은 out.write(여기 들어있는 데이터를 적겠다.)
    ) {
      int data = 0;
      byte[] b = new byte[1024];
      while ((data = in.read(b)) != -1) {
        out.write(b);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
