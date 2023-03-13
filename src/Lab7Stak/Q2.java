package Lab7Stak2;

public class Q2 {
    public static void main(String[] args) {
        SlinkedStak<Integer>list=new SlinkedStak<>();


        list.push(11);
        list.push(12);
        list.push(13);
        list.push(14);
        list.print(list);
        System.out.println();
        System.out.print("the element deleted:  ");
       list= list.recursive(list);
        System.out.println();
        list.print(list);


}
}
