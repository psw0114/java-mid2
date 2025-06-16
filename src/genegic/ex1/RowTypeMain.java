package genegic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); //제네럴 타입 생략할 경우 Object 타입 변환
//        GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        // Integer result = integerBox.get(); // 형변환 안 하면 컴파일 에러
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);



    }
}
