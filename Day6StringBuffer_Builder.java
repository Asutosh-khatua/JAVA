//Writr a Java Program  to implement string, stringBuffer and stringBuilder
public class Day6StringBuffer_Builder {
    public static void main(String[] args) {
        // String (Immutable)
        String str = "Hello";
        str.concat(" Java");
        System.out.println("String: " + str); // Output: Hello

        // StringBuffer (Mutable & Thread-safe)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println("StringBuffer: " + sb); // Output: Hello Java

        // StringBuilder (Mutable & Fast)
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" Java");
        System.out.println("StringBuilder: " + sb2); // Output: Hello Java
    }
}
