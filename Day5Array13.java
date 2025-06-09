//Wap to find samllest element present inside an array.
//import java.util.Arrays;
public class Day5Array13 {

    public static void main(String[] args) {
        int[] arr={4,3,9,7,8,6,5};
        int smallest=arr[0];
        for(int num:arr)
        {
            if(num<smallest)
            {
                smallest=num;
            }
        }
        System.out.println("Smallest element:"+smallest);
    }
}