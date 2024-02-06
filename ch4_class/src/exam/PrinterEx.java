package exam;

public class PrinterEx {

  public static void main(String[] args) {
    Printer printer = new Printer();
    // 생성자로 객체 printer를 생성, printer 안에있는 println 기능으로 출력

    printer.println(10);
    printer.println(true);
    printer.println(5.7);
    printer.println("홍길동");
  }
}
