package exam2;

public class Won2Dollar extends Converter {

  @Override
  protected double convert(double src) {
    return src / 1200.0;
  }

  @Override
  protected String getSrcSting() {
    return "원";
  }

  @Override
  protected String getDestString() {
    return "달러";
  }
}
