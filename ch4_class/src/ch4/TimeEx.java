package ch4;

public class TimeEx {

  public static void main(String[] args) {
    Time time = new Time(); // time 객체의 인스턴스 생성
    time.setHour(15);
    time.setMinute(40);
    time.setSecond(11.12f);

    Time time2 = new Time(); // 인스턴스 생성, 인스턴스변수 : 인스턴스마다 다른 값 저장 가능, 참조변수가 없을 때 가비지컬렉터에 의해 자동 제거됨
    time2.setHour(16);
    time2.setMinute(38);
    time2.setSecond(13.12f);
  }
}
