package collection.array;

import java.util.Arrays;

/**
 * 기존 add() 메서드 개선
 * 리스트의 마지막에 데이터를 추가하는게 아니라 index위치에 데이터 추가
 * remove(index) 메서드 생성
 * index 위치의 데이터를 삭제한다
 */
public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }


    public void add(Object e) {
        //추가
        if(size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(int index, Object e) {
        //추가
        if(size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    //추가
    private void grow () {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData,newCapacity);
    }

    // size =3 index =4 3>4
    // 코드 추가, 요소의 마지막부터 index까지 오른쪽으로 값 이동
    private void shiftRightFrom(int index) {
        for(int i= size; i> index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    // index:0  size:4
    private void shiftLeftFrom(int index) {
        for(int i = index; i <size -1; i++ ) {
            elementData[i] = elementData[i + 1];
        }
    }

    public Object remove(int index) {
        Object oldValue = get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for(int i = 0; i < size; i++) {
            if(o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(
                Arrays.copyOf(elementData, size))
                + " size =" + size + ","
                + " capacity =" + elementData.length;
    }

}
