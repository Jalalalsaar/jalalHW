package Lab7Stak2;

public class Q1 {

        public static void main(String[] args) {
            SlinkedStak<Integer>list=new SlinkedStak<>();
            SlinkedStak<Integer>list1=new SlinkedStak<>();

            list.push(11);
            list.push(12);
            list.push(13);
            list.push(14);
         list1.tansfer(list,list1);
list1.print(list1);
            System.out.println();
            while (!list1.isEmpty()){
                System.out.print(list1.pop()+"  ");
            }

        }
    }


