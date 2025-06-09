//Wap to display all the even elemnt and odd element separately present inside an array.
import java.util.Arrays;
public class Day5Array17 {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,1,8,9,4};
        int size=arr.length;
        int j=0;
        int k=0;
        int[] Earr=new int[size];
        int[] Oarr=new int[size];
        for(int x:arr)
        {
            if(x%2==0)
            {
              Earr[j]=x;
              j++;  
            }
            else{
                Oarr[k]=x;
                k++;
            }
        }
        int EvenArr[]=Arrays.copyOf(Earr,j);
        int OddArr[]=Arrays.copyOf(Oarr,k);
        System.out.println(Arrays.toString(EvenArr));
        System.out.println(Arrays.toString(OddArr));
    } 
    }
    
