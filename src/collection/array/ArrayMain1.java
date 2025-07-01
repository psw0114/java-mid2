package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    //index 입력: O(1)
    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력: O(1)
        System.out.println("==index 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        //index 변경: O(1)
        System.out.println("==index 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        //index 조회: O(1)
        System.out.println("==index 조회: O(1)==");
        System.out.println("arr[2]: " + arr[2]);

        //검색: O(n)
        System.out.println("==index 조회: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
            if(arr[i] == value) {
                System.out.println(value+ "찾음");
                break;
            }
        }
    }
}

/**
 * 배열의 특징
 *  배열에서 자료를 찾을 때 인덱스를 사용하면 매우 빠르게 자료를 찾을 수 있다
 *  인덱스를 통한 입력,변경,조회의 경우 한번의 계산으로 자료의 위치를 찾을 수 있다. *
 */

/**
 * arr[2]에 위치한 자료를 찾는다고 가정해보자
 * 배열은 메모리상에 순서대로 붙어서 존재한다, int는 4byte를 차지한다.
 * 따라서 배열의 시작위치 x100부터 시작해서 자료의 크기(4byte)와 인덱스 번호를 곱하면 원하는 메모리 위치를 찾을 수 있다.
 *  식) 배열의 시작 참조  + 자료의 크기 x 인덱스위치
 *  예) x100 + 4byte x 2 = x108
 *  int[5] = [x100][x104][x108][x112][x116]
 *
 *  따라서 배열에서 인덱스랄 사용하는 경우 데이터가 아무리 많아도 한 번의 연산으로 필요한 위치를 찾을 수 있다.
 */

/**
 *
 */

