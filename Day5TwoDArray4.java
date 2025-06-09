import java.util.Scanner;
public class Day5TwoDArray4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the row and column size:");
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        int[][] arr1=new int[row][col];
        int[][] arr2=new int[row][col];
        int[][] resArr=new int[row][col];
        System.out.println("For 1st matrix:");
        for(int i=0;i<=row-1;i++)
        {
            for(int j=0;j<=col-1;j++)
            {
                System.out.println("enter the element for arr1["+i+"]["+j+"]");
                arr1[i][j]=scanner.nextInt();
            }
        }
       
        System.out.println("For 2nd matrix:");
        for(int i=0;i<=row-1;i++)
        {
            for(int j=0;j<=col-1;j++)
            {
                System.out.println("enter the element for arr2["+i+"]["+j+"]");
                arr2[i][j]=scanner.nextInt();
            }
        }
        //Addition purpose
        for(int i=0;i<=row-1;i++)
        {
            for(int j=0;j<=col-1;j++)
            {
               
                resArr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("here is 1st matrix");
        for(int i=0;i<=row-1;i++)
        {
            for(int j=0;j<=col-1;j++)
            {
               
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("here is 2nd matrix");
        for(int i=0;i<=row-1;i++)
        {
            for(int j=0;j<=col-1;j++)
            {
               
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("here is the Addition Matrix");
        for(int i=0;i<=row-1;i++)
        {
            for(int j=0;j<=col-1;j++)
            {
               
                System.out.print(resArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
