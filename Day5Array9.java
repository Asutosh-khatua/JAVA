//Wap to copy element from one array to another array.
import java.util.Scanner;
public class Day5Array9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of an array:");
      
        int size=scanner.nextInt();
        int[] arr=new int[size];
        int[] new_arr=new int[size];

        for(int i=0;i<=arr.length-1;i++){
            System.out.println("enter the value for "+i+" index number:");
            arr[i]=scanner.nextInt();
        }
      
        System.out.println("the elements are:");
        for(int x:arr){
            System.out.println(x);
        }

        for(int i=0;i<=arr.length-1;i++){
            new_arr[i]=arr[i];
        }

        System.out.println("the copy elements are:");
        for(int x:new_arr){
            System.out.println(x);
        }
        scanner.close();
    }
    
}
