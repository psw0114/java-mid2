package genegic.ex3;

import genegic.animal.Cat;
import genegic.animal.Dog;

public class AnimalHospitalMainV2 {
    /**
     * AnimalHospitalV2 <T> 를 사용해서 제네릭 타입을 선언했다
     * 제네릭 타입을 선언하면 자바 컴파일 입장에서 T에 어떤 값이 들어올지 예측할 수 없다.
     * 기대한 Animal 타입의 자식의 코드 정보를 없기 때문에
     * T에는 타입 인자로 Integer,Dog, Object 전부 들어올 수 있다.
     *
     * 자바 컴파일러는 어떤 타입이 들어올 지 알 수 없기 때문에
     * T 를 어떤 타입이든 받을 수 있는 모든 객체의 최종 부모인
     * Object 타입으로 가정한다. 따라서 Object 가 제공하는 메서드만 호출할 수 있다
     * 즉 원하는 Animal 타입의 기능을 사용할 수 없다.
     * 또한 Animal 과 관계 없는 Integer, Object 타입이 인자도 들어올 수 있다.
     * 타입을 최소한 Animal 이나 그 자식을 타입으로 제한해야 한다.
     */

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}
