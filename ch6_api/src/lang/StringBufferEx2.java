package lang;

public class StringBufferEx2 {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    // StringBuffer sb2 = "Hello"; (X) String처럼 간략화 불가능

    // append() : 원본 문자열 뒤에 추가 // String과 달리 원본이 바뀜
    System.out.println(sb1);
    System.out.println("append() " + sb1.append(" World"));
    System.out.println(sb1);
    // String str1 = "Hello"; str1 += "123"; str += 456
    sb1.append("123").append(456).append(12.3f);
    System.out.println(sb1);

    // charAt()
    System.out.println(sb1.charAt(3));

    // delete() : 끝 위치 문자 제외
    sb1.delete(3, 6); // 3 4 5 번 문자 삭제
    System.out.println(sb1);

    sb1.deleteCharAt(5); // 5 번 위치에 있는 문자 삭제
    System.out.println(sb1);

    // insert() : 넣을 위치 , 넣을 문자
    sb1.insert(4, " 012345 ");
    System.out.println(sb1);

    // length()

    // replace() 시작위치 ~ 끝나는위치 직전 까지 " " 로 바꿈
    sb1.replace(0, 3, "AB"); // 012 위치의 문자가 AB로 대체
    System.out.println(sb1);

    // reverse() : 거꾸로 출력하기
    String str2 = "0123456789";
    // 9876543210 출력하기
    for (int i = str2.length() - 1; i > -1; i--) {
      System.out.print(str2.charAt(i));
    }

    System.out.println();
    System.out.println();

    StringBuffer sb3 = new StringBuffer("0123456789");
    System.out.println(sb3.reverse());

    // String => StringBuffer
    StringBuffer sb4 = new StringBuffer(str2); // String타입 str2를 StringBuffer로 바꿈
    System.out.println(sb4.reverse());

    //index 자리가 ch문자로 바뀜
    sb1.setCharAt(1, 'K');
    System.out.println(sb1);

    StringBuilder sBuilder = new StringBuilder("Hello");
    //sBuilder.append(str2); StringBuilder == StringBuffer 쓰레드세이프차이
  }
}
