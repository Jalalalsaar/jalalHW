package Lab8Queue2;

class Q3 {
    public static void main(String[] args) {
       SLinkedQueue<Integer> L=new SLinkedQueue<>();
       SLinkedQueue<Integer> M=new SLinkedQueue<>();
        L.enqueue(10);
        L.enqueue(20);
        L.enqueue(30);
        M.enqueue(40);
        M.enqueue(50);
        M.enqueue(60);
      L=L.append(L,M);
      L.print();

    }
}
