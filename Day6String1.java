//Writr a Java Program  to implement concat() method
import java.util.Scanner;
public class Day6String1{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
      
        System.out.print("Enter a string:");
        String str=scanner.next();
        String str1=str.concat("_world");
      
        System.out.println(str);
        System.out.println(str1);
        scanner.close();
    }
}