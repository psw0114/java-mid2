package genegic.ex3;

import genegic.animal.Cat;
import genegic.animal.Dog;

public class AnimalHospitalMainV1 {
    // 요구사항
    // AnimalHospitalMainV0의 문제점들을 다형성을 사용해서 중복을 제거해보자

    // 문제
    // 코드 재사용 O: 다형성을 통해 AnimalHospitalV1 하나로 개와 고양이를 모두 처리한다.
    // 타입 안정성 X :
    //  -개 병원에 고양이를 전달하는 문제가 발생한다.
    //  -Animal 타입을 반환하기 때문에 다운 캐스팅을 해야 한다.
    //  -실수로 고양이를 입력했는데, 개를 반환하는 상황이라면 캐스팅 예외가 발생한다
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
         dogHospital.set(cat); // 매개변수 체크 실패 : 컴파일 오류가 발생하지 않음
         dogHospital.checkup();

        // 문제2: 개타입 반환, 캐스팅 필요
        // Animal 타입으로 반환되기 때문에 Dog로 타입 캐스팅 필요
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200));
//        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
