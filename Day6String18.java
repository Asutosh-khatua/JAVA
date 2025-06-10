//Writr a Java Program  to implement subString() method
import java.util.Scanner;
public class Day6String18{
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=scanner.next();//Asutosh
        
    System.out.println(str.substring(0,3));
    scanner.close();
    }
}