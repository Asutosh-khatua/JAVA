public class Day4NestedIf {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You need an ID to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
