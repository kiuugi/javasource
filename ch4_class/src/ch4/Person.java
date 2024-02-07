package ch4;

public final class Person { // 클래스에도 final 붙음 -- 상속금지

  // 멤버변수에 final 이 붙은 경우
  // 초기화(선언, 생성자)를 반드시 해야 함
  // 수정 불가 = 처음 수정한 값으로 끝까지 써야함
  // final 변수 == 상수(바꾸지 못하는 항상 같은값)

  // 클래스에 final 이 붙은 경우 - 상속금지
  // 메소드에 final이 붙은 경우 - 오버라이딩 금지
  private String name;
  private final String nation; // set,get 불가능

  // 객체끼리 공유(static)하는 상수(final 변경이 불가능한)
  // 상수는 대문자로 표현
  //private static final double PI = 3.141592; 키워드 위치는 상관없음
  private static final double PI = 3.141592;

  public static double getPi() {
    return PI;
  }

  public Person(String name, String nation) { // final : 초기화 안하면 에러남. The blank final field nation may not have been initialized
    this.name = name;
    this.nation = nation;
  }

  public final String getName() { // 메소드에도 final 붙을 수 있음 -- 오버라이딩 금지
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }
}
