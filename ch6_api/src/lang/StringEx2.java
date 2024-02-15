package lang;

import java.util.Date;

public class StringEx2 {

  public static void main(String[] args) {
    // 생성자
    String str1 = new String("Hello");
    char[] chars = { 'H', 'e', 'l', 'l', 'o' };
    String str2 = new String(chars);

    String str3 = "Hello";

    //메소드
    // return type => 변수담기 or sout
    char ch = str1.charAt(0);
    // charAt() : 인덱스 위치 문자 반환
    System.out.println("charAt(0) : " + ch);
    System.out.println("charAt(3) : " + str2.charAt(3));

    // concat() : 문자열 뒤에 연결
    String result = str1.concat(" world");
    System.out.println("concat() " + result);

    // compareTo() : 0, -1, 1 리턴 // 문자열을 정렬할 때 사용
    // 문자열을 사전 순서로 비교(유니코드)
    // 같으면 0, 사전순으로 이전이면 음수, 이후면 양수
    // a 97, b 98 (97-98)
    // 가장 앞의 문자비교 후 같으면 뒤에 문자비교
    System.out.println(str1.compareTo(str3));
    System.out.println("aaa".compareTo("bbb"));
    System.out.println("bbb".compareTo("aaa"));
    System.out.println("bbb".compareTo("baa"));

    // contains() : 지정된 문자열이 포함되었는지 검사(대소문자 구별)
    System.out.println(str1.contains("Hell"));

    //endsWith() : 지정된 문자열로 끝나는지 검사
    System.out.println("endsWith() : " + str3.endsWith("t"));
    System.out.println("endsWith() : " + "Hello.txt".endsWith("txt"));
    //startsWith() : 지정된 문자열로 시작하는지 검사
    System.out.println(str3.startsWith("H"));

    // equals() / equalsIgnoreCase() 대소문자 구별하지 말고 비교
    // Hello == HELLOW (문자 대소문자 구별 함)
    System.out.println("equalsIgnoreCase " + str1.equalsIgnoreCase("HELLO"));
    System.out.println("equals " + str1.equals("HELLO"));

    // indexOf() : 주어진 문자가 문자열에 존재하는지 확인하여 위치 반환
    //             있으면 위치 인덱스, 없으면 -1
    System.out.println("indexOf() " + str1.indexOf("s"));
    System.out.println("indexOf() " + str1.indexOf('s')); // indexOf()오버로딩 되어서 여러 형태로 가능
    System.out.println("indexOf() " + str1.indexOf('e'));
    // 2번을 시작위치로 지정
    System.out.println("indexOf() " + str1.indexOf('e', 2)); // e를 찾을건데 2번 위치부터 찾기시작

    // lastIndexOf() : 지정된 문자를 문자열의 오른쪽 끝에서부터 찾아서 위치 반환
    // 왼쪽 끝 위치값 0 부터 시작
    String str4 = "java.lang.String";
    System.out.println("lastIndexOf() " + str4.lastIndexOf("."));
    System.out.println("indexOf() " + str4.indexOf("."));

    // length() : 문자열 길이 반환

    // replace() : 문자를 새로운 문자로 바꾼 문자열 반환
    String replaceStr = str1.replace('H', 'h');
    System.out.println("replace() " + replaceStr);
    str2 = str2.replace("ll", "LL"); // str2.replace 의 값을 새로운 String으로 반환할 뿐 str2를 바꾸는것은 아님
    System.out.println(str2); // Hello // 그래서 원본 str2에 다시 replace값을 담으면 됨
    str4 = "Hellollo";
    System.out.println("replace() " + str4.replace("ll", "LL"));
    System.out.println("replaceAll() " + str4.replaceAll("ll", "LL"));
    System.out.println("replaceFirst() " + str4.replaceFirst("ll", "LL")); // 처음만난 "ll" 만 바꿈

    // split() : 문자열 분리(기준에 따라)한 후 배열로 리턴
    String[] staArr = str1.split(""); // 문자 하나씩
    for (String string : staArr) {
      System.out.println(string);
    }

    str4 = "dog, cat, bear";

    staArr = str4.split(","); // ,를 만나면
    for (String string : staArr) {
      System.out.println(string);
    }

    // 문자열 전체를 지정된 숫자로 자른다
    staArr = str4.split(",", 2); // 배열의 크기
    for (String string : staArr) {
      System.out.println(string);
    }

    // substring() : 시작 위치부터 끝 위치에 포함된 문자열 추출
    // 시작 위치는 포함 하지만 끝 위치는 포함하지 않음
    System.out.println(str1.substring(1));
    System.out.println(str1.substring(1, 4));

    //roLowerCase() : 모든 문자를 소문자로 반환
    //toUpperCase() : 모든 문자를 대문자로 반환
    System.out.println("toLowerCase " + str1.toLowerCase());
    System.out.println("toUpperCase " + str1.toUpperCase());

    // toString() : 오버라이딩되서 가지고있음
    System.out.println(str1);
    System.out.println(str1.toString());

    // 공백 하나는 문자 하나
    // trim() : 앞, 뒤 공백 제거
    // "Hello" == " Hello " ? : 공백때문에 다름
    str4 = "          Hello       World    ";
    System.out.println("trim() 전 " + str4);
    System.out.println("trim() 후 " + str4.trim());

    // valueOf() : 지정된 값을 문자열로 변환하여 반환
    int num = Integer.parseInt("100"); // 지정된 값을 int로 변환하여 반환
    String num1 = String.valueOf(100);
    System.out.println(num1);
    num1 = String.valueOf(1.3);
    System.out.println(num1);
    num1 = String.valueOf(1.3f);
    System.out.println(num1);
    num1 = String.valueOf(1000L);
    System.out.println(num1);
    num1 = String.valueOf('c');
    System.out.println(num1);
    Date d = new Date();
    num1 = String.valueOf(d); // 객체 obj
    System.out.println(num1);

    int i = 100;
    String type = String.valueOf(i); // "100"
    type = i + ""; // == String type = String.valueOf(i); // "100"

    // String.valueOf(10) <=> Integer.parseInt("10") or Integer.valueOf("10")
    // String.valueOf(10.3) <=> Double.parseDouble("10.3") or Double.valueOf("10.3")
    // "10.3f" <=> 10.3f
    Double.parseDouble("10.3");
    Float.parseFloat("10.3f");
    Long.parseLong("1000L");
  }
}
