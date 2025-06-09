//Wap to copy element of an array to another array.
import java.util.Arrays;
public class Day5Array11 {

    public static void main(String[] args) {
        int[] arr={4,3,9,7,8,6,5};
        int[] newArr=new int[arr.length];
        
        newArr=Arrays.copyOf(arr, arr.length);//how much element u want
        System.out.println(Arrays.toString(newArr));
    }
}