package genegic.ex3;

import genegic.animal.Animal;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에서 알수 없다.
        // 따라서 Object의 기능만 사용 가능 ( toString)
        animal.toString();
        // 컴파일 오류
        // System.out.println("동물 이름: " + animal.getName());
        // System.out.println("동물 크기: " + animal.getSize());
        // animal.sound();
    }

    public T getBigger(T target) {
        // 컴파일 오류
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
