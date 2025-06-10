//Writr a Java Program  to implement charAt() method
import java.util.Scanner;
public class Day6String2{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.next();
        
        System.out.println(str.charAt(3));
        scanner.close();
    }
}