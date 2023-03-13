package Lab5CircluyLinkedList;

public class Q2 {
    public static void main(String[] args) {
    CircularlyLinkedList<Integer>list=new CircularlyLinkedList<>();

        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
list.print();
        System.out.println("Size of list: "+list.methodSize(list));

        System.out.println("Size of list: "+list.size());

    }
}
