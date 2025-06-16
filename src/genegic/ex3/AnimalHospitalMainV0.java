package genegic.ex3;

import genegic.animal.Cat;
import genegic.animal.Dog;

public class AnimalHospitalMainV0 {
    // 요구사항
    // 개병원은 개만 받고 고양이병원은 고양이만 받을 수 있어야 한다.
    // 따라서 개병원,고양이병원을 별도의 클래스로 만든다.
    // 각 클래스별로 타입이 명확하기 때문에 개병원은 개만, 고양이 병원은 고양이만 받는다.
    // 개병원에 고양이를 전달하면 컴파일 오류 발생
    // 그리고 개병원에서 bigger()로 다른 개를 비교하는 경우 더 큰 개를 Dog타입으로 반환한다
    // 문제
    // 코드 재사용 x : 개병원과 고양이병원은 중복이 많음
    // 타입 안정성 O : 타입 안정성이 명확하게 지켜짐
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
        // dogHospital.checkup(cat); // 다른 타입 입력: 컴파일 오류

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
