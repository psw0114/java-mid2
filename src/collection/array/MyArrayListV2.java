package collection.array;

import java.util.Arrays;


/**
 * 최초에 설정한 배열값이 가득 차면
 * 기존 배열을 복사한 새로운 배열을 만들고 배열의 크기도 2배로 증가
 * Arrays.copyOf(기존배열,새로운길이) 사용
 */
public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
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

    //추가
    private void grow () {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData,newCapacity);

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
