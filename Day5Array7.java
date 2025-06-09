//wap to add all the odd index element present inside given array. 
public class Day5Array7 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int mul=1;
      
        for(int i=0;i<=arr.length-1;i++)
        {
            if(i%2!=0){
                mul=mul*arr[i];
            }  
        }
        System.out.println(mul);
    } 
}
