package collection.array;

/**
 * 제네릭을 사용해 타입 인자로 지정한 타입만 안전하게 저장하고 조회 가능
 * 각 타입에 맞는 데이터만 저장,조회 가능
 * 수동 다운캐스팅 x
 */
public class MyArrayListV4Main {

    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
//        stringList.add(4); //컴파일 에러
        String string = stringList.get(0);
        System.out.println("string = " + string);
        System.out.println("stringList = " + stringList);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
//        intList.add("4"); // 컴파일 에러
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
        System.out.println("intList = " + intList);
    }


}
