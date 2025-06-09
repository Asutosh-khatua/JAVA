//Wap to remove the duplicate element from the array.

import java.util.Arrays;

public class Day5Array16 {
    public static void main(String[] args) {
        int[] arr={2,3,2,3,4,5,4,6,4,2,7,8,10};
        int size=arr.length;
        int[] newArr=new int[size];
        int j=0;
        for(int num:arr)
        {
            boolean isDuplicate=false;
            for(int i=0;i<=size-1;i++)
            {
                if(num==newArr[i])
                {
                    isDuplicate=true;
                    //break;
                }
            }
            if(!isDuplicate)
            {
                newArr[j]=num;
                j++;
            }
        }
        int[] uniqueArr=Arrays.copyOf(newArr, j);
        System.out.println(Arrays.toString(uniqueArr));
        
    }
}
        
    
