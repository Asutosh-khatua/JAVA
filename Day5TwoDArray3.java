//WAP to take user input in 2D array.
import java.util.Scanner;
public class Day5TwoDArray3 {
    public static void main(String[] args) {
     
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the row and column size:");
        
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        int[][] arr=new int[row][col];
        
        for(int i=0;i<=row-1;i++)
        {
            for(int j=0;j<=col-1;j++)
            {
                System.out.println("enter the element for a["+i+"]["+j+"]");
                arr[i][j]=scanner.nextInt();
            }
        }
        
        System.out.println("here is the elements");
        for(int i=0;i<=row-1;i++)
        {
            for(int j=0;j<=col-1;j++)
            {
               
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
