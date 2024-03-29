package shop;

public class SmartTV extends Product {

  private String resolution;

  public SmartTV(String pname, int price, String resolution) {
    super(pname, price);
    this.resolution = resolution;
  }

  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  @Override
  void printExtra() {
    System.out.println("해상도 : " + resolution);
  }

  @Override
  public String getPname() {
    return super.getPname();
  }

  @Override
  public int getPrice() {
    return super.getPrice();
  }
}
