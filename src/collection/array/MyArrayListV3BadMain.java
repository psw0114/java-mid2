package collection.array;

/**
 * 앞서 만든 MyarrayList들은 Object를 입렫받기 때문에,
 * 아무 데이터나 입력 가능하고, 결과로  Object를 반환한다
 * 따라서 필요한 경우 다운캐스팅이 필요하고, 타입 안정성이 떨어지는 단점이 있다
 */
public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        // 숫자만 입력 하기를 기대
        numberList.add(1);
        numberList.add(2);
        System.out.println(numberList);
        numberList.add("문자3"); //문자를 입력
        System.out.println(numberList);

        //Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        // ClassCastException 발생, 문자를 Integer로 캐스팅
        Integer num3 = (Integer) numberList.get(2);
    }


}
