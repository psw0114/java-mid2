package genegic.ex4;

import genegic.animal.Cat;
import genegic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰멍멍이",200);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);
        System.out.println("bigger : " + bigger);
    }
}
