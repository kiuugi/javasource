package ch4;

// 멤버변수 초기값
// String : null
// int, long : 0
// float, double : 0.0
// char : ' '
// boolean : false

// 클래스 : 설계도
// 객체 : 실제 존재
public class TvEx {

  public static void main(String[] args) {
    //생성자 호출
    Tv tv = new Tv();
    // System.out.println(tv.color); // null
    // System.out.println(tv.channel); // 0
    // System.out.println(tv.power); // false

    // tv.color = "black";
    // tv.channel = 3;
    // tv.power = true; // true => on
    Tv tv2 = new Tv("black", 3, true);

    tv2.channelUp();
    System.out.println("현재 채널 " + tv2.getChannel());

    // 채널 번호 직접 입력
    tv2.setChannel(45);
    System.out.println("현재 채널 " + tv2.getChannel());

    //전원 끄기
    tv2.setPower(false);
    System.out.println("전원 상태 " + tv2.isPower());
  }
}
