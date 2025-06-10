//Writr a Java Program to count all the space present inside a string
import java.util.Scanner;
public class Day6String13{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=scanner.nextLine();
        int count=0;
       for(int i=0;i<=str.length()-1;i++)
       {
            if(str.charAt(i)==' ')
            {
                count++;
            }
       }
       System.out.println("No of spaces:"+count);
        scanner.close();
    }
} 