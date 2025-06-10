//Writr a Java Program to implement length() method
import java.util.Scanner;
public class Day6String3{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.next();
        
        System.out.println(str.length());
        scanner.close();
    }
}