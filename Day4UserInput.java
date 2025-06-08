import java.util.Scanner;

public class Day4UserInput {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Take String input
        System.out.print("Enter your name: "); 
        String name = scanner.nextLine();

        // Step 3: Take integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Step 4: Take double input
        System.out.print("Enter your marks: ");
        double marks = scanner.nextDouble();

        // Output
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        // Close the scanner
        scanner.close();
    }
}
