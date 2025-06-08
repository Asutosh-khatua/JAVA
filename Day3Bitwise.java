public class Day3Bitwise {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        System.out.println("a & b: " + (a & b));  // 0101 & 0011 = 0001 → 1
        System.out.println("a | b: " + (a | b));  // 0101 | 0011 = 0111 → 7
        System.out.println("a ^ b: " + (a ^ b));  // 0101 ^ 0011 = 0110 → 6
        System.out.println("~a: " + (~a));        // ~0101 = 1010 (in 2's complement) → -6
        System.out.println("a << 1: " + (a << 1)); // 0101 becomes 1010 → 10
        System.out.println("a >> 1: " + (a >> 1)); // 0101 becomes 0010 → 2
    }
}
