package lang;

// extends Object 기본 안써줘도 그냥 들어와있음
public class Value {

  int value;

  public Value(int value) {
    this.value = value;
  }

  // 값을 비교하도록 equals를 재정의함
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Value) { // obj가 Value의 객체인가(instanceof)?
      Value v = (Value) obj;
      if (this.value == v.value) {
        return true;
      }
    }
    return false;
  }

  // 멤버 변수들의 값을 확인하는 용도로 재정의
  @Override
  public String toString() {
    return "Value [value=" + value + "]";
  }
}
