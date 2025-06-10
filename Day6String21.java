//write a program to find out the largest word from the given string.
import java.util.Scanner;
//import java.util.Arrays;
public class Day6String21{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.nextLine();

        String[] arr=str.split(" ");
        
        String large="";
        int largest=arr[0].length();

        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i].length()>=largest)
            {
                largest=arr[i].length();
                large=arr[i];
            }
        }
        System.out.println(large);
        scanner.close();
    }
}