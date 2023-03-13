package Lab8Queue2;

public class SLinkedQueue<E> implements interfaceQueue<E> {
       SingleLinkedList<E> list=new SingleLinkedList<>();//هذه الجاهزة
        @Override
        public boolean isEmpty() {
            return list.isEmpty();
        }

        @Override
        public int size() {
            return list.size();
        }

        @Override
        public E first() {

              return list.first() ;  //طابور عادي

        }

        @Override
        public void enqueue(E e) {

             list.addLast(e);//طابور عادي
        }

        @Override
        public E dequeue() {

             return   list.removeFirst(); //طابور عادي
        }
        public void rotate(){
            enqueue(dequeue());
        }
    public SLinkedQueue<E> append(SLinkedQueue<E> L, SLinkedQueue<E> M) {

        L.list.size+=M.list.size;
        L.list.tail.next=M.list.head;
        L.list.tail= M.list.tail;

        return L;
    }
    public void print(){
           SingleLinkedList.Node<E> i=list.head;
        while (i!=null){
            System.out.println(i.getElement());
            i=i.next;
    }
    }
}


