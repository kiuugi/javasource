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

public class BigLetters3 {

  public static void main(String[] args) {
    // 익명구현 : 1회성
    Runnable r = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 101; i++) {
          System.out.print(i + " ");
        }
      }
    };
    Thread t = new Thread(r); // 위의 익명클래스 쓰레드1
    t.start(); // 쓰레드를 시작시키기위해 대기 Q에 보내기 // 시작해주세요

    Thread t2 = new SmallLetters2(); // smallletters쓰레드2
    t2.start();

    for (char ch = 'A'; ch <= 'Z'; ch++) { // 메인쓰레드3
      System.out.print(ch + " ");
    }
  }
}
