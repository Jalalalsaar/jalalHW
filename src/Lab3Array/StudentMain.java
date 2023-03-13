package Lab3Array;

import java.util.Arrays;

public class StudentMain {

    public static void main(String[] args) {
        StudentClass[] copy=new StudentClass[3];
         copy[0]=new StudentClass(124,"jaber");
        copy[1]=new StudentClass(123,"sam");
        copy[2]=new StudentClass(153,"jalal");
        StudentClass copy2[]=copy.clone();
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy2));
    }
    }

