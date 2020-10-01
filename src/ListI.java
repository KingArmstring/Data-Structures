public interface ListI<E> {

    void addFirst(E obj);

    void addLast(E obj);

    E removeFirst(E obj);

    E removeLast(E obj);

    int getCurrentSize();

    E remove(int k);

    E remove(E obj);

    boolean contains(E obj);

    void addAtPosition(int k);

    E peakFirst();

    E peakLast();

    int find(E obj);


}
