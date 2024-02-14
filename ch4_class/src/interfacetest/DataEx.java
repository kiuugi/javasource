package interfacetest;

// 다형성을 구현하고자 하는 형태
// 자식들로 객체를 생성 - 받는건 부모로 받음
// 자식들이 오버라이드된 상태.
public class DataEx {

  public static void main(String[] args) {
    // DataAccessObject obj = new Oracle();
    // dbWork(obj);
    // obj = new MySql();
    // dbWork(obj);
    dbWork(new Oracle());
    dbWork(new MySql());

    // 익명 클래스(anonymous) : 일회용 클래스(선언과 생성 동시에)
    DataAccessObject Object = new DataAccessObject() { // 클래스와 똑같은 구성, 이름이 없기때문에 생성자처럼 보이지만 생성자의 역할보다 클래스 자체임.
      @Override
      public void select() {
        System.out.println("PostgreSql 검색");
      }

      @Override
      public void insert() {
        System.out.println("PostgreSql 삽입");
      }

      @Override
      public void update() {
        System.out.println("PostgreSql 수정");
      }

      @Override
      public void delete() {
        System.out.println("PostgreSql 삭제");
      }
    }; // 일회용 클래스 끝날때 ;
    dbWork(Object);
  }

  public static void dbWork(DataAccessObject dao) {
    dao.select(); // Oracle DB에서 검색 or MySql DB에서 검색
    dao.insert();
    dao.update();
    dao.delete();
  }
}
