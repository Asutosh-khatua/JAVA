public class Day4Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // loop ends when i is 3
            }
            System.out.println("Count: " + i);
        }
    }
}
