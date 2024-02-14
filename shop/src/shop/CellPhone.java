package shop;

public class CellPhone extends Product {

  private String carrier;

  public CellPhone(String pname, int price, String carrier) {
    super(pname, price);
    this.carrier = carrier;
  }

  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  @Override
  void printExtra() {
    System.out.println("통신사 : " + carrier);
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
