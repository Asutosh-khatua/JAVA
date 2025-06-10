//Writr a Java Program to implement replace() method
import java.util.Scanner;
public class Day6String8{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");//sagar
        String str=scanner.next();
        
        System.out.println(str.replace('a','p'));
        scanner.close();
    }
}