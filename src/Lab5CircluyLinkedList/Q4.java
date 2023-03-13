package Lab5CircluyLinkedList;

public class Q4 {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> L=new CircularlyLinkedList<>();
        CircularlyLinkedList<Integer> M=new CircularlyLinkedList<>();
        CircularlyLinkedList<Integer> K=new CircularlyLinkedList<>();
        L.addFirst(11);
        L.addLast(12);

        M.addFirst(12);
        M.addLast(11);

        K.addFirst(11);
        K.addLast(11);
/////////////////////////////////////////////////////////////////////////////
        if (L.sameSequence(L,M))
            System.out.println("list M and list L equals" );
        else
            System.out.println("list M and list L not equals" );

        if (K.sameSequence(L,K))
            System.out.println("list M and list L equals" );
        else
            System.out.println("list K and list L not equals" );
    }
}
