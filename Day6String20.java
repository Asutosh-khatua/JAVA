//write a java program to check whether a string is palindrome or not.
import java.util.Scanner;
public class Day6String20{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=scanner.next();
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }
        if(str.equals(str1))
        {
        System.out.println("palindrome");
        }
        else
        {
        System.out.println("not palindrome");
        }
       
        scanner.close();
    }
}