package poly;

public class CarEx {

  public static void main(String[] args) {
    Car car = null;

    FireEngine fe1 = new FireEngine();
    FireEngine fe2 = null;

    Ambulance ambulance = null;
    // ambulance = fe1; 상속관계가 아닌 클래스는 형변환 불가능

    // 자동 형변환
    fe1.water();
    car = fe1; // Car car = new FireEngine(); // 자식 클래스의 부모클래스범위
    //            Car 만큼의 범위를 FireEngine()에서

    // cast : 강제형변환
    fe2 = (FireEngine) car; // 자식클래스를 가르키고있었지만 범위가 부모클래스만 가능했기때문에 강제 형변환으로 범위를 늘림
    fe2.water();
    //Car car2 = new Car();
    // 에러 ClassCastException : 실행 시 에러 발생
    //FireEngine fe3 = (FireEngine) car2; // 에초에 부모클래스만 가르키고 있었기 때문에 범위를 늘릴 수 없음
    //fe3.water();
  }
}
