package ch4;

public class Tv {

  //색상(검정, 흰색), 전원상태(on, off), 채널(6,7, ...), 볼륨(13,14), 크기(50, 46), ...
  private String color; // private 은 멤버변수에만 붙임
  private int channel;
  private boolean power;

  //
  void channelUp() {
    channel++;
  }

  void channelDown() {
    channel--;
  }

  //생성자 오버로딩
  //Tv(){}

  public Tv() {}

  public Tv(String color, int channel, boolean power) {
    this.color = color;
    this.channel = channel;
    this.power = power;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public boolean isPower() {
    return power;
  }

  public void setPower(boolean power) {
    this.power = power;
  }
}
