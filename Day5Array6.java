//wap to add all the even element and add all the odd element separately.
public class Day5Array6 {
    public static void main(String[] args) {
     
        int[] arr={2,3,4,5,6,7,8};
        int evensum=0;
        int oddsum=0;
     
        for(int x:arr)
        {
            if(x%2==0)
            {
                evensum=evensum+x;
            }
            else{
                oddsum=oddsum+x;
            }
        }
       
        System.out.println("Even Sum="+evensum);
        System.out.println("Odd Sum="+oddsum);
    }
    
}
