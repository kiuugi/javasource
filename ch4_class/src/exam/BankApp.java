package exam;

import java.util.Scanner;

public class BankApp {

  //같은 클래스 안에서 선언된 애들끼리 바로 호출가능. static 객체생성 x
  static Scanner sc = new Scanner(System.in);
  static Account accArr[] = new Account[100];

  public static void main(String[] args) {
    boolean run = true;

    while (run) {
      System.out.println("---------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("---------------------------------------");
      System.out.print("메뉴선택 >> ");
      int menu = Integer.parseInt(sc.nextLine());

      switch (menu) {
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          deposit();
          break;
        case 4:
          withdraw();
          break;
        case 5:
          System.out.println("시스템을 종료합니다.");
          run = false;
          break;
      }
    }
  }

  static void createAccount() {
    System.out.println("계좌번호 : ");
    String accountNum = sc.nextLine();

    System.out.println("이름 : ");
    String name = sc.nextLine();

    System.out.println("잔액 : ");
    int balance = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] == null) {
        accArr[i] = new Account(accountNum, name, balance);
        System.out.println("계좌가 생성되었습니다.");
        break;
      }
    }
  }

  static void accountList() {
    for (Account account : accArr) {
      if (account != null) {
        System.out.println(account);
      }
    }
  }

  static void deposit() {
    System.out.print("예금할 계좌 : ");
    String accNum = sc.nextLine();
    System.out.print("예금액 : ");
    int amount = Integer.parseInt(sc.nextLine());
    Account account = findAccount(accNum);
    if (account != null) {
      System.out.println("현재 잔액 : " + account.deposit(amount));
    }
  }

  static void withdraw() {
    System.out.print("출금할 계좌 : ");
    String accNum = sc.nextLine();
    System.out.print("출금액 : ");
    int amount = Integer.parseInt(sc.nextLine());
    Account account = findAccount(accNum);
    if (account != null) {
      System.out.println("현재 잔액 : " + account.withdraw(amount));
    }
  }

  static Account findAccount(String accNum) {
    for (Account account : accArr) {
      if (account != null) {
        if (account.getAccountNum().equals(accNum)) {
          return account;
        }
      }
    }
    return null;
  }
}
//     for (int i = 0; i < accArr.length; i++) {
//       if (accArr[i] != null) {
//         if (accNum.equals(accArr[i].getAccountNum())) {
//           return accArr[i];
//         }
//       }
//     }
//     return null;
