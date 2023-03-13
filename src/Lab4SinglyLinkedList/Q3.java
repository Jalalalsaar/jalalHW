package Lab4SinglyLinkedList;

public class Q3 {
    public static void main(String[] args) {
        SingleLinkedList<Integer>list=new SingleLinkedList<>();

        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);

        System.out.println("Size of list: "+list.methodSize(list));
        System.out.println("Size of list: "+list.size());

    }
}
