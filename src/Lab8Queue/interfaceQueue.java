package Lab8Queue2;

public interface interfaceQueue<E> {
    boolean isEmpty();
    int size();
    E first();
    void  enqueue(E e);
    E dequeue();


    SLinkedQueue<E> append(SLinkedQueue<E> L, SLinkedQueue<E> M);
}
