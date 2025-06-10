//Writr a Java Program to display all the words of a string which contains more than 2 character
import java.util.Scanner;
import java.util.Arrays;

public class Day6String16{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.nextLine();
       String[] arr=str.split(" ");
       
       //System.out.println(Arrays.toString(arr));
        System.out.println("More than 2 letter:");
       for(int i=0;i<=arr.length-1;i++)
       {
        if(arr[i].length()>2)
        {
            System.out.println(arr[i]);
        }
       }
        scanner.close();
    }
} 
