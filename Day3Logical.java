public class Day3Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;

        // Logical AND
        System.out.println(a > b && a < c);  // true && true = true

        // Logical OR
        System.out.println(a > b || a > c);  // true || false = true

        // Logical NOT
        System.out.println(!(a > b));        // !(true) = false
    }
}
