// bineary search
//import java.util.*;

public class G_binearsearch{ 

    public static int  binearysearch(int arr[], int key){

        int start = 0,  end = arr.length-1;

        while(start <= end){
            int mid =(start +end)/2; 

            //comparisons 
            if(arr[mid] ==key){
                return mid;
            } 
            if(arr[mid]<key){ //right 
                    start = mid+1;
                } 

             else{
                    end = mid-1;
                }
        } 
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6}; 

        int key = 4; 

       int result =  binearysearch(arr , key); 

        if(result == -1){
            System.out.println("key is not found");
        } 
        else{
            System.out.println("key is found at index  " +result  );
        }
    }
}