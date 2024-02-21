package generics;

// T, E : 객체

public class BoxEx {

  public static void main(String[] args) {
    Box box = new Box();

    box.setItem(new String("홍길동"));
    String name = (String) box.getItem(); // 여러 타입을 담은 box라서 가지고 나올때 가지고 나오려고 하는 타입과 타입 변환을 해줘야함

    box.setItem(Integer.valueOf(10));
    Integer i = (Integer) box.getItem();

    box.setItem(Float.valueOf(3.14f));
    Float f = (Float) box.getItem();

    Box2<String> box2 = new Box2<>(); //box에 담기 전에 담을 타입을 지정
    box2.setItem("홍길동");
    box2.setItem("김유신");
    String str = box2.getItem(); // 담기 전에 String 으로 타입을 지정해놨기 때문에 부를때 타입을 지정할 필요가 없음

    Box2<Integer> box3 = new Box2<>();

    Box2<Float> box4 = new Box2<>();
    Box2<Double> box5 = new Box2<>();

    Box3<Fruit> fruitBox = new Box3<>();
    Box3<Apple> appleBox = new Box3<>();
    Box3<Grape> grapebox = new Box3<>();
    Box3<Toy> toyBox = new Box3<>();

    // 부모 타입으로 설정 시 자식 객체 담는 것 허용
    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    fruitBox.add(new Grape());
    // fruitBox.add(new Toy());

    appleBox.add(new Apple());
    // appleBox.add(new Fruit());

    grapebox.add(new Grape());

    toyBox.add(new Toy());

    FruitBox<Fruit> fruitBox2 = new FruitBox<>();
    fruitBox2.add(new Fruit());
    fruitBox2.add(new Apple());
    fruitBox2.add(new Grape());
    // fruitBox2.add(new Toy());

    System.out.println(Juicer.makeJuice(fruitBox2));
  }
}
