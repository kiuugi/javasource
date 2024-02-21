package io;

import java.io.IOException;
/*
 * java.io.* : io(input/output)
 * 기본 input : keyborard
 * 기본 output : 화면
 *
 * 스트림 : 입출력을 수행할 때 어느 한 쪽에서 다른 쪽으로 데이터 전달시 두 대상을 연결하는 통로 같은 개념
 *          다방향만 가능(입력, 출력 => 2개의 스트림 필요)
 * 1. 바이트 기반 스트림(문자, 이미지, 동영상, ...)
 *      InputStream(추상 클래스) : 입력 스트림 부모
 *      OutputStream(추상 클래스) : 출력 스트림 부모
 *
 * 2. 문자 기반 스트림(문자)
 *      Reader(추상)
 *      Writer(추상)
 *
 *
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class InputStreamEx1 {

  public static void main(String[] args) {
    InputStream in = System.in; // System.in : 키보드 => Scanner
    // in.read() : 한 바이트씩 읽어와서 int 로 리턴
    // in.read(byte[] b); : byte 배열로 읽어와서 읽어온 byte를 int 로 리턴
    // in.read(byte[] b, 0, 100); : 입력 스트림에서 100byte를 읽어와서 0번 위치부터 저장 // 배열로 읽어와서 특정 위치에 해당하는 데이터만 int 로 리턴 //

    OutputStream out = System.out;
    // out.write(byte[] b);
    // out.write(int);
    // out.write(byte[] b, 0, 100);
    try {
      //   한바이트만 입력시
      //   int input = in.read();
      //   out.write(input);
      //   System.out.println((char) input);

      // 여러 바이트 입력 시 // 배열아님
      //   int input = 0;
      //   while ((input = in.read()) != -1) {
      //     //   System.out.println((char) input);
      //     out.write(input);
      //   }

      byte b[] = new byte[100];
      in.read(b);
      // System.out.println(Arrays.toString(b)); // 97, 98, 99, 13, 10 : a, b, c, 엔터 누른거
      out.write(b);

      in.close();
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
