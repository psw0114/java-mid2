package genegic.ex3;

import genegic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // 컴파일 오류
         System.out.println("동물 이름: " + animal.getName());
         System.out.println("동물 크기: " + animal.getSize());
         animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
