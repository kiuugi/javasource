package inheritance;

public class Tv {

  private boolean power;
  private int channel;

  public Tv() {}

  public Tv(boolean power, int channel) {
    this.power = power;
    this.channel = channel;
  }

  void power() {
    power = !power; // boolean이니까 == ON / OFF
  }

  void channelUp() {
    channel++;
  }

  void channelDown() {
    channel--;
  }

  public int getChannel() {
    return channel;
  }

  public boolean isPower() {
    return power;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }
}
