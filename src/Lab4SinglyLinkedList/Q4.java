public class Q4 {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list=new SingleLinkedList<>();

        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
list.rotate();
        while (!list.isEmpty()){
            System.out.print("  "+list.removeFirst()+" ");
        }
    }
}
