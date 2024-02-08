package inheritance;

public class ChildEx {

  public static void main(String[] args) {
    // 부모, 자식 인스턴스 생성 가능 함
    Parent parent = new Parent(15);
    Child child = new Child(20);
    Child2 child2 = new Child2(25);
    GrandChild grandChild = new GrandChild(30);

    System.out.println("부모의 멤버변수 " + parent.getAge());
    System.out.println("자식의 멤버변수 " + child.getAge());
    System.out.println("자식의 멤버변수 " + child2.getAge());
    System.out.println("Parent가 물려준 멤버변수 " + grandChild.getAge());

    child.play();
    grandChild.play(); // child가 물려준 멤버 메소드

    //오버라이딩 메소드

    parent.print(); // 부모(base)클래스
    child.print(); // extends Parent 여기서 오버라이딩을 함.
    child2.print(); // extends Parent 오버라이딩을 한 child와는 상관없는 Parent의 자식클래스
    grandChild.print(); // extends Child // Child에서 한 오버라이딩을 그대로 받음
  }
}
