package exception;

import java.util.Scanner;

public class LoginEx {

  public static void main(String[] args) {
    // 사용자로부터 아이디와 비밀번호 입력받기
    Scanner sc = new Scanner(System.in);
    System.out.print("아이디 입력 : ");
    String id = sc.nextLine();
    System.out.print("비밀번호 입력 : ");
    String pwd = sc.nextLine();

    try {
      Login(id, pwd);
    } catch (NotExisitIdException e) {
      e.printStackTrace();
    } catch (WrongPassordException e) {
      e.printStackTrace();
    }
    // 아이디가 blue 와 일치하지 않으면 NotExisitIdexception 발생

    // 비밀번호가 12345 와 일치하지 않으면 WrongPasswordException 발생

  }

  public static void Login(String id, String pwd)
    throws NotExisitIdException, WrongPassordException {
    if (!id.equals("blue")) {
      throw new NotExisitIdException("아이디를 확인해 주세요");
    }

    if (!pwd.equals("12345")) {
      throw new WrongPassordException("비밀번호를 확인해 주세요");
    }

    System.out.println("로그인 완료");
  }
}
