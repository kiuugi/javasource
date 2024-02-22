package generics;

// 제한된 제네릭 클래스
// T extends Fruit : 특정과  타입의 그 타입의 자손들만 대입
// ? super T : 특정 타입과 그 타입의 부모들만 대입

// sort(List<T> list, Comparator<? super T> c)
// Sort(List<Apple> list, Comparator<? super Apple> c)
// Comparator<Apple>, Comparator<fruit>, Comparator<Object>

// Sort(List<Toy> list, Comparator<? super Toy> c)
// Compatator<Toy>, Comparator<Object>

public class FruitBox<T extends Fruit> extends Box3<T> {} //<T 상속받는(extends) Fruit 를>
