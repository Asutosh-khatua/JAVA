//Writr a Java Program to display all the characters of a string one by one
import java.util.Scanner;
public class Day6String12{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.next();
       for(int i=0;i<=str.length()-1;i++)
       {
            System.out.println(str.charAt(i));
       }
        scanner.close();
    }
} 