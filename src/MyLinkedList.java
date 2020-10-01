public class MyLinkedList<E> implements ListI<E>{

    class Node {
        Node next;
        E data;

        public Node(E data) {
            this.data = data;
        }
    }

    Node head;
    int currentSize;

    public MyLinkedList() {
        head = null;
        this.currentSize = 0;
    }

    @Override
    public void addFirst(E obj) {
        Node node = new Node(obj);
        node.next = head;
        head = node;
        currentSize++;
    }

    @Override
    public void addLast(E obj) {

        if (head == null) {
            addFirst(obj);
            return;
        }

        Node node = new Node(obj);
        Node temp = head;
        while (temp.next != null) { //NPE
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        currentSize++;

    }

    @Override
    public E removeFirst(E obj) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        return temp.data;
    }

    @Override
    public E removeLast(E obj) {
        Node last = head;
        Node previous = head;
        while (last.next != null) {
            previous = last;
            last = last.next;
        }
        E temp = last.data;
        previous.next = null;
        return temp;
    }


    @Override
    public int getCurrentSize() {
        return currentSize;
    }

    @Override
    public E remove(int k) {
        return null;
    }

    @Override
    public E remove(E obj) {
        Node node = head;
        //while loop
        if (((Comparable<E>)node).compareTo(obj) == 0) {
            //do the remove part.
            //return the removed object.
        }
        return null;
    }

    @Override
    public boolean contains(E obj) {
        return false;
    }

    @Override
    public void addAtPosition(int k) {

    }

    @Override
    public E peakFirst() {
        return null;
    }

    @Override
    public E peakLast() {
        return null;
    }

    @Override
    public int find(E obj) {
        return 0;
    }
}
