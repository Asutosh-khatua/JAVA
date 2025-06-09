//Wap to take user input of an array and display the array.
import java.util.Scanner;
public class Day5Array8 {
    public static void main(String[] args) {
     Scanner scanner=new Scanner (System.in);
     System.out.println("enter the size of an array:");   
    
     int size=scanner.nextInt();
     int[] arr=new int[size];
    
     for(int i=0;i<=arr.length-1;i++){
        System.out.println("enter the value of "+i+" index no.:");
        arr[i]=scanner.nextInt();
     }
     System.out.println("elements are :");
     for(int num:arr){
        System.out.println(num);
     }
     scanner.close();
    }
}
