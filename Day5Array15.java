//Wap to dislay the index number of an element present inside an array.

import java.util.Scanner;

public class Day5Array15 {
    public static void main(String[] args) {
        int[] arr={4,3,9,7,8,6,5};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to find Index:");
        int num=scanner.nextInt();
        int flag=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(num==arr[i])
            {
                System.out.println("index number="+i);
                flag++;
                break;
            }  
        }
        if(flag==0)
        {
            System.out.println("Enter a valid input...!");
        }
    }
}
