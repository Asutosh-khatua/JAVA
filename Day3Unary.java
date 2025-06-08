public class Day3Unary {
    public static void main(String[] args) {
        int a = 5;
        boolean flag = true;

        System.out.println("Unary Plus: " + (+a));     // +5
        System.out.println("Unary Minus: " + (-a));    // -5

        System.out.println("Pre-Increment: " + (++a)); // Increases a to 6, prints 6
        System.out.println("Post-Increment: " + (a++));// Prints 6, then a becomes 7

        System.out.println("Pre-Decrement: " + (--a)); // a becomes 6, prints 6
        System.out.println("Post-Decrement: " + (a--));// Prints 6, then a becomes 5

        System.out.println("Logical NOT: " + (!flag)); // false
    }
}
