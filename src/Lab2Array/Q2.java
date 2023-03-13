import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
       int [] arr1 ={11,22,33,44,55};

        System.out.println(Arrays.toString(arr1));

        int [] arr2=arr1.clone();
        System.out.println(Arrays.toString(arr2));

    }
}
