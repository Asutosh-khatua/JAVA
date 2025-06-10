//Writr a Java Program to display all the characters of a string present at odd index.
import java.util.Scanner;
public class Day6String14{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.next();
       for(int i=0;i<=str.length()-1;i++)
       {
            if(i%2!=0)
            {
                System.out.println(str.charAt(i));
            }
       }
        scanner.close();
    }
} 