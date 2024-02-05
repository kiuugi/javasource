package array;

public class ArrayEx12 {

  public static void main(String[] args) { // main 옆에 있는 String 배열 사용. Json 에서 "args": "${command:SpecifyProgramArgs}"
    for (String str : args) {
      System.out.println(str);
      System.out.println(str.length());
    }
  }
}
