public class Q2 {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list=new SingleLinkedList<>();

        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
  SingleLinkedList.Node<Integer>i= list.getSecondLast();
        System.out.println(i.getElement());
        System.out.println(i);
    }
}