public class Day4Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // skips when i is 3
            }
            System.out.println("Count: " + i);
        }
    }
}