package ch4;

// 오버로딩
// - 하나의 클래스에 동일한 이름으로 존재
// - () 안에 인자의 개수, 타입이 달라야 함

// 생성자 오버로딩
// 메소드 오버로딩

public class Time {

  // 멤버변수, 속성, 필드, 인스턴스 변수
  // 인스턴스변수 : 인스턴스마다 다른 값 저장 가능
  private int hour;
  private int minute;
  private float second;

  // 클래스 변수 / 클래스 변수에는 static이 붙음
  private static String max;

  // 생성자
  public Time() {}

  public Time(int hour, int minute, float second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  // 메소드
  // 시, 분, 초는 모두 0보다 크거나 같아야한다,
  // 시의 범위는 0~23, 분,초의 범위는 0~59 이다.
  public int getHour() {
    return hour;
  }

  //메소드 내부에 선언된 변수 : 지역변수 : 메소드 종료후 소멸, for, if => {} 블럭 내부에 선언된 변수는 블럭을 벗어나는 경우 소멸
  public void setHour(int hour) {
    if (hour < 0 || hour > 23) {
      return; //만나면 즉시 돌아감 // 타입이 void일때 가능.
    }
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute < 0 || minute > 60) {
      return;
    }
    this.minute = minute;
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    if (second < 0 || second > 60) {
      return;
    }
    this.second = second;
  }
}
