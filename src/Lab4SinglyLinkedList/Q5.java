package Lab4SinglyLinkedList;

public class Q5 {
    public static void main(String[] args) {
        SingleLinkedList<Integer>L=new SingleLinkedList<>();
        SingleLinkedList<Integer>M=new SingleLinkedList<>();
        L.addFirst(11);
        L.addLast(12);
        L.addLast(13);
        L.addLast(14);
        L.addLast(15);
        M.addFirst(16);
       M.addLast(17);
        M.addLast(18);
        M.addLast(19);
        M.addLast(20);
        L=L.margin(L,M);
        while (!L.isEmpty()){
            System.out.print("  "+L.removeFirst()+" ");
        }

    }
}
