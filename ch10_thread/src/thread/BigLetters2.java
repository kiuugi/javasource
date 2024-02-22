package thread;

// Thread(쓰레드)
// 프로세스 : 실행중인 프로그램(OS로 부터 실행에 필요한 자원(메모리)을 할당받아 실행)
// 프로세스 : 프로그램을 수행하는 데 필요한 데이터 + 자원 + 쓰레드(실제로 작업을 수행)
// 모든 프로세스는 최소한 하나 이상의 쓰레드가 존재 => 둘 이상의 쓰레드를 가진 프로세스를 멀티쓰레드 프로세스
//
// 멀티 쓰레드 구현 (카카오톡처음 채팅과 파일전송 등 여러 일을 동시에 처리)
// 1) Runnable 구현하는 클래스 작성
//       - run() 오버라이딩
//       -
// 2) Thread 상속받는 클래스 작성
//

public class BigLetters2 {

  public static void main(String[] args) {
    Thread t = new SmallLetters2();
    t.start(); // 쓰레드가 시작하기 전 데기장소로 감

    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.print(ch + " ");
    }
  }
}
