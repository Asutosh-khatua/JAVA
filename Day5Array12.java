//Wap to find largest element present inside an array.
//import java.util.Arrays;
public class Day5Array12 {

    public static void main(String[] args) {
        int[] arr={10,3,9,7,8,6,5};
        int largest=arr[0];
        for(int num:arr)
        {
            if(num>=largest)
            {
                largest=num;
            }
        }
        System.out.println("largest element :"+largest);
    }
}