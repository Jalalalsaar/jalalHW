import java.util.Arrays;

///. Write a Java method that Reverse an array using another array.
public class Q1 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;


        }
        System.out.println(Arrays.toString(arr));


    }
}
