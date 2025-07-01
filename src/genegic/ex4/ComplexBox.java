package genegic.ex4;

import genegic.animal.Animal;

/**
 * 정적 메서드는 제네릭 메서드만 적용할 수 있지만,
 * 인스턴스 메서드는 제네릭 타입도 제네릭 메서드도 둘 다 적용할 수 있다.
 * 여기에 제네릭 타입과 제네릭 메서드의 타입 매개변수를 같은 이름으로 사용하면
 *
 */
public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    //클래스의 T extends Animal과는 전혀 관계 없는 T
    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        // t.getName(); // 호출 불가 메서드는 <T> 타입이다. <T extends Animal> 타입이아니다.
        return t;
    }
}
