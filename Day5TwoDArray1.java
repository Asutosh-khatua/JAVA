//Wap to display all the element present inside 2D array.

public class Day5TwoDArray1 {
    public static void main(String[] args) {
        int[][] arr={{2,3,4},{1,5,6},{7,8,9}};
      
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr[i].length-1;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}
