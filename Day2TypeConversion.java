public class Day2TypeConversion {
    public static void main(String[] args) {
        // Implicit Conversion (Widening)
        int num = 100;
        double doubleNum = num;
        System.out.println("Implicit Conversion (int to double): " + doubleNum);

        // Explicit Conversion (Narrowing)
        double value = 99.99;
        int intValue = (int) value;
        System.out.println("Explicit Conversion (double to int): " + intValue);
    }
}
