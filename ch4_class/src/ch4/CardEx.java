package ch4;

public class CardEx {

  // static이 붙은 void 타입인 이름이 main인 (){} 메소드
  // static이 없으면 =new~ 를 사용해서 호출하지 않는 한 로딩되지 않음;
  public static void main(String[] args) {
    Card card1 = new Card("heart", 2);
    Card card2 = new Card("spade", 5);

    //static으로 만들어진 클래스 변수 // 공통의 값, 클래스이름.(대문자시작) 으로 불러와야함
    System.out.println("카드 크기 " + Card.wideth);
    System.out.println("카드 크기 " + Card.height);

    // 노랑줄 The static field Card.wideth should be accessed in a static way
    // System.out.println("카드크기 " + card2.wideth);
    // System.out.println("카드크기 " + card2.height);

    //공유 값 변경
    //static이 붙은 클래스 변수 이기 때문에 클래스 명으로 바로 불러올 수 있음.
    Card.wideth = 80;
    Card.height = 50;

    // static 에서 non-static 메소드, 변수 호출 불가 > 호출하려면 같은 static 으로 만들기 또는 인스턴스 생성 후 접근하기
    CardEx obj = new CardEx(); // 2) 인스턴스를 생성한다.
    obj.method1(); // 1) 다른 메소드도 static으로 만든다.
  }

  public void method1() {
    System.out.println("인스턴스 메소드");
  }
}
