public class Day4ElseIfLadder {
    public static void main(String[] args) {
        int marks = 65;

        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Very Good");
        } else if (marks >= 60) {
            System.out.println("Good");
        } else if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
