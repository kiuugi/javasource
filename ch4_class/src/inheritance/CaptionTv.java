package inheritance;

public class CaptionTv extends Tv {

  boolean caption;

  public CaptionTv(boolean caption) {
    this.caption = caption;
  }

  public CaptionTv(boolean power, int channel, boolean caption) {
    super(power, channel); // 부모 클래스가 가지고있는 멤버변수
    this.caption = caption; // 자식 클래스가 가지고있는 멤버변수
  }

  void displayCaption(String text) {
    // if (!caption)
    // 조건구문이  true 일때 조건문이 실행되니까 참 거짓으로 나오는 boolean 타입은 그대로 쓰면 됨
    if (caption) {
      System.out.println(text);
    }
  }
  //public CaptionTv (){super();} -- defalt 생성자
}
