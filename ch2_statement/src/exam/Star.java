package exam;

public class Star {

  public static void main(String[] args) {
    // 별찍기
    for (int i = 1; i < 6; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("-----------");

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 5 - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j < i; j++) {
        if (i < j) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("-----------");

    for (int i = 1; i <= 5; i++) {
      for (int j = 0; j < 5 - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("------------");

    for (int i = 0; i <= 5; i++) {
      for (int j = 0; j < 5 - i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }

    System.out.println("--------------------------");
  }
}
