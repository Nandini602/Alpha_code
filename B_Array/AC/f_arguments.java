
//import java.util.*;

public class f_arguments{

    public static void update(int arr[]){
        for(int i=0; i<arr.length;i++){
            arr[i] = arr[i] + 1;
            
        }
    }
    public static void main(String args[]){ 
        int arr[] = {12,23,45};  
        update(arr); 

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        } 
        System.out.println();

    }
}