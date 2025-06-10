//Writr a Java Program to implement equals() method .
import java.util.Scanner;
public class Day6String4{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter two string:");
        String str1=scanner.next();
        String str2=scanner.next();

        if(str1.equals(str2))
         System.out.println("Both are store in same location.");
        scanner.close();
    }
}