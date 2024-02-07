package exam;

import java.util.Scanner;

public class AccountEx2 {

  public static void main(String[] args) {
    //Account 객체를 감을 배열 생성
    Account accountArr[] = new Account[3];

    //입력
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < accountArr.length; i++) {
      System.out.println("계좌번호 : ");
      String accountNum = sc.nextLine();

      System.out.println("이름 : ");
      String name = sc.nextLine();

      System.out.println("잔액 : ");
      int balance = Integer.parseInt(sc.nextLine());

      accountArr[i] = new Account(accountNum, name, balance);
    }

    for (Account account : accountArr) {
      System.out.println(account);
    }
  }
}
