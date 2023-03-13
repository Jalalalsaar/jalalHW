package Lab4SinglyLinkedList;

public class TestSingly {
    public static void main(String[] args) {
        SingleLinkedList<Integer>list=new SingleLinkedList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);

        while (!list.isEmpty()){
            System.out.println(list.removeFirst()+" ");
        }
    }
}
