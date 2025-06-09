//Wap to find 2nd largest element present inside an array.
import java.util.Arrays;
public class Day5Array14 {

    public static void main(String[] args) {
        int[] arr={4,3,9,7,8,6,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("2nd largest element is:"+arr[arr.length-2]);
    }
}