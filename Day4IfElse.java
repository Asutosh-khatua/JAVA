public class Day4IfElse {
    public static void main(String[] args) {
        int score = 78;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }
}
