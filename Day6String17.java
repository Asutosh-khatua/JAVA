//Writr a Java Program to implement split() method
import java.util.Scanner;
import java.util.Arrays;

public class Day6String17{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.nextLine();

        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}