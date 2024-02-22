package io;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

// DataInputStream / DataOutputStream
// byte 단위가 아닌 기본 자료형 단위로 읽고 쓸 수 있다.
// 기본 자료형 값을 16진수로 표현하여 저장

public class DataStreamEx {

  public static void main(String[] args) {
    try (
      FileOutputStream fos = new FileOutputStream("C:\\temp\\primtive.dat"); // 쓰기(출력)
      DataOutputStream dos = new DataOutputStream(fos);
      FileInputStream fis = new FileInputStream("C:\\\\temp\\\\primtive.dat"); // 읽기(입력)
      DataInputStream dis = new DataInputStream(fis);
    ) {
      // 쓰기
      dos.writeUTF("홍길동");
      dos.writeDouble(95.5);
      dos.writeInt(1);

      dos.writeUTF("김자바");
      dos.writeDouble(95.7);
      dos.writeInt(2);

      // 읽기
      for (int i = 0; i < 2; i++) {
        String name = dis.readUTF();
        double jumsu = dis.readDouble();
        int num = dis.readInt();
        System.out.println(num + " : " + name + "(" + jumsu + ")");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
