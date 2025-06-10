//Writr a Java Program to display all the vowels present at even index of a string.
import java.util.Scanner;

public class Day6String15 {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.next();
        str = str.toLowerCase(); // Convert to lowercase

        System.out.println("Vowels at even indexes:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check for even index and vowel
            if (i % 2 == 0 && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                System.out.println("Index " + i + ": " + ch);
            }
        }
        scanner.close();
    }
}