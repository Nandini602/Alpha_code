

//import java.util.*; 

public class L_maxsubarray{

    public static void maxsubarray(int arr[]){

         
        int maxsum = Integer.MIN_VALUE; 

        for(int i=0;i<arr.length;i++){
            for(int j=i; j<arr.length;j++){ 
                int currsum = 0 ;
                for(int k=i;k<=j;k++){
                    //subarray sum
                    currsum = arr[k] + currsum;
                } 

                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum ;
                }
            }
        } 
        System.out.println("max sum  " + maxsum);
    }

    public  static void main(String args[]){
        int arr[] = {2,4,6,8,10}; 

        maxsubarray(arr);
    }
}