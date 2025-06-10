//Write a java program to reverse a string,sentense....
//1.
/*import java.util.Scanner;
public class Day6String19{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.next();
        
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
        scanner.close();
    }
}*/
//2.
import java.util.Scanner;
//import java.util.Arrays;
public class Day6String19{
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=scanner.nextLine();
    String[] arr=str.split(" ");
    int size=arr.length;
    //System.out.println(Arrays.toString(arr));
    for(int i=size-1;i>=0;i--)
    {
        System.out.print((arr[i]+" "));
    }
       
    scanner.close();
    }
}
