package loop;

public class ForEx5 {

  public static void main(String[] args) {
    //*
    //**
    //***
    //****
    //*****
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
  }
}
