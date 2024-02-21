package generics;

// Generics(제네릭스)
// 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스 컴파일 시 타입체크를 해주는 기능
// 장점
// 타입 안정성 제공 / 타입체크와 형변환 생략 가능하므로 코드 간결

// 제네릭스를 적용한 클래스
public class Box2<T> { // <T> 타입 지정

  private T item; // 객체타입 T

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
}
