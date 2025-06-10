//Writr a Java Program to implement toLowerCase() method
import java.util.Scanner;
public class Day6String7{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.next();
        
        System.out.println(str.toLowerCase());
        scanner.close();
    }
}