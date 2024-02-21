package generics;

// 제한된 제네릭 클래스
// T extends Fruit : 특정 타입의 자손들만 대입

public class FruitBox<T extends Fruit> extends Box3<T> {} //<T 상속받는(extends) Fruit 를>
