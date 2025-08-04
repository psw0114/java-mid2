package collection.link;

public class MyLinkedListV3<E> {
    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

//    public Object set(int index, Object element) {
////        Node x = getNode(index);
////        Object oldValue = x;
////        x.item = element;
////        return oldValue;
////    }

    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index) {
        Node<E> x = getNode(index);
        return x.item;
    }

    // O(n)
    public Node<E> getNode(int index){
        Node<E> x = first;
        for(int i = 0; i< index; i ++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for(Node<E> x =first; x != null; x= x.next){
            if(x.item == o) {
                return index;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }


//    public void add (int index, Object e) {
//        Node newNode = new Node(e);
//        if(index == 0) {
//            newNode.next = first;
//            first = newNode;
//        }else {
//            Node prev = getNode(index-1);
//            newNode.next = prev.next;
//            prev.next = newNode;
//        }
//        size ++;
//    }
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

//    public Object remove(int index) {
//        Node removeNode = getNode(index);
//        Object removeItem = removeNode.item;
//
//        if(index == 0) {
//            first = removeNode.next;
//        }else {
//            Node prev = getNode(index -1);
//            prev.next = removeNode.next;
//        }
//
//        removeNode.item = null;
//        removeNode.next = null;
//        size--;
//        return removeItem;
//    }

    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first" + first +
                ", size" + size +
                "]" ;
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node (E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> temp = this;
            sb.append("[");
            while (temp != null) {
                sb.append(temp.item);
                if(temp.next != null) {
                    sb.append("->");
                }
                temp = temp.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
