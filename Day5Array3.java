//Wap to add 5 if the no.is even and multiply 5 if the no.is odd in an array.
public class Day5Array3 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        
        for(int x:arr)
        {
            if(x%2==0)
            {
                System.out.println(x+5);
            }
            else{
                System.out.println(x*5);
            }
        }
    }
}
