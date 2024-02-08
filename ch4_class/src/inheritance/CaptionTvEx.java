package inheritance;

public class CaptionTvEx {

  public static void main(String[] args) {
    CaptionTv cTv = new CaptionTv(false, 10, false);
    cTv.setChannel(15);
    cTv.channelUp();
    System.out.println("현재 채널 " + cTv.getChannel());

    cTv.displayCaption("Hello world1");
    cTv.caption = true;
    cTv.displayCaption("Hello world2");
  }
}
