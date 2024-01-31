package exam;

import java.util.Scanner;

// (32°F − 32) × 5/9 = 0°C

public class Degrees {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("화씨 온도 입력");
    int fahr = sc.nextInt();

    double cels = (fahr - 32) * 5 / 9.0;

    System.out.println((fahr - 32) * 5 / 9);
    System.out.println("섭씨 온도 : " + cels);
  }
}
