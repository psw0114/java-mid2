package collection.array;

import java.util.Arrays;

/**
 * 앞서 만든 MyArrayList 타입 안정성을 향상시키자
 * 제네릭을 도입하여 타입 안정성을 확보하자
 * 제니릭은 자료를 보관하는 자료구조에 어울린다
 */

/**
 * Object[] elementData 를 그대로 사용한 이유
 * 제네릭은 런타임에 이레이저에 의해 타입 정보가 사라진다.
 * 따라서 런타임에 타입 정보가 필요한 생성자에 사용할 수 없다.
 * 제네릭을 기반으로 생성한 배열은 작동하지 않고 컴파일 에러가 발생한다
 * ex) New E[DEFAULT_CAPACITY]
 * 따라서 Object와 같이 모든 데이터를 담을 수 있게 생성해야한다
 * ex) New Object[DEFAULT_CAPACITY]
 *
 */
public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }


    public void add(E e) {
        //추가
        if(size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(int index, E e) {
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

    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    // 다운 캐스팅 없이 안전하게 조회
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(E o) {
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
