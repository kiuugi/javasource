package array;

public class ArrayEx11 {

  public static void main(String[] args) {
    // String 배열
    String[] name = { "Kim", "Park", "Choi" };

    for (String str : name) {
      System.out.println(str);
    }

    for (int i = 0; i < name.length; i++) {
      String str = name[i];

      for (int j = 0; j < str.length(); j++) {
        char ch = str.charAt(j); // charAt 문자열의 하나의 문자만 가져옴.
        System.out.printf("str.charAt(%d) : %c\n", j, ch);
      }
    }

    String src = "ABCDE"; // String을 개별로 나눌 수 있다.
    char[] chArr = src.toCharArray(); // 캐릭터 배열로 바뀜
    System.out.println(chArr);
    System.out.println(chArr[1]);
  }
}
