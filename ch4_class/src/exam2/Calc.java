package exam2;

public abstract class Calc {

  int a;
  int b;

  void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  abstract int calculate();
}
