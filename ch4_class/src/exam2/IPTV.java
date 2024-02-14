package exam2;

public class IPTV extends ColotTV {

  private String ip;

  public IPTV(int size, int colot, String ip) {
    super(size, colot);
    this.ip = ip;
  }

  @Override
  void printProperty() {
    System.out.println(
      "나의 IPTV는 " +
      ip +
      " 주소의 " +
      getSize() +
      "인치 " +
      getColot() +
      "컬러"
    );
  }
}
