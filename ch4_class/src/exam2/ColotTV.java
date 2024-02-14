package exam2;

public class ColotTV extends TV {

  private int colot;

  public ColotTV(int size, int colot) {
    super(size);
    this.colot = colot;
  }

  void printProperty() {
    System.out.println(getSize() + "인치 " + colot + "컬러");
  }

  protected int getColot() {
    return colot;
  }
}
