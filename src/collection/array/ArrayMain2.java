package collection.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        //배열의 첫번째 위치에 추가
        //기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번째 위치에 데이터 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr,newValue);
        System.out.println(Arrays.toString(arr));

        //index 위치에 추가
        //기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        //배열의 마지막 위치에 추가
        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));

    }

    private static void addLast(int[] arr, int newValue){
        arr[arr.length -1] = newValue;
    }

    private static void addFirst(int[] arr, int newValue) {

        for(int i = arr.length -1; i >0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] =newValue;
    }

    private static void addAtIndex(int[] arr, int index, int value){
        for(int i = arr.length -1; i>index; i--) {
            arr[i] = arr[i -1];
        }
        arr[index] = value;
    }

    /**
     * 배열의 한계
     * 배열은 가장 기본적인 구조이고, 인덱스를 사용할 때 최고의 효율이 나온다.
     * 하지만 배열의 크기는 생성하는 시점에 미리 정해야하는 단점이 있다.
     *
     * 처음부터 배열의 크기를 작게하면 배열의 이동/복사가 자주 일어나서 속도가 느려지고,
     * 처음부터 너무 많은 배열을 확보하면 메모리 낭비가 많아진다
     */


}
