
import java.util.*;

public class C_swap{ 

    public static void swap(int a , int b ){ 
           
           int temp = a ; 
           a = b; 
           b = temp ; 

           System.out.println("a " + a ); 

           System.out.println("b  " + b);

    }
    public static void main(String args[]){
        
        //swap - value
        int a = 20; 
        int b =  12; 
          swap(a,b);
        //swap 
        // int temp  = a; 
        // a = b; 
        // b = temp ;
        // System.out.println("a =" + a) ; 
        // System.out.println("b= " + b);
        
    }
}