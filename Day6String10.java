//Writr a Java Program to implement stripLeading() method
import java.util.Scanner;
public class Day6String10{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.next();
        
        System.out.println(str.stripLeading());
        scanner.close();
    }
}