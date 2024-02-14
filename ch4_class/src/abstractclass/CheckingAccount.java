package abstractclass;

// 자식 클래스에서 부모클래스(추상클래스)의 미완성 부분을 완성해야함

public class CheckingAccount extends Account {

  @Override
  public void print() {
    throw new UnsupportedOperationException("Unimplemented method 'print'");
  }
}
