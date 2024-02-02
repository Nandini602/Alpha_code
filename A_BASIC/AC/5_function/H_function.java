

import java.util.*; 


public class H_function{
    // fun to cal int sum 
    public static int sum(int a, int b){
        int sum1 =  a+b;
        return sum1;
    }
 

    // function to call float sum
    public static float sum(float a, float b){
        float sum2 = a+b;
        return sum2;
    }
    public static void main(String args[]){ 
        System.out.println(sum(3,2));  
        System.out.println(sum(3.5f , 1.1f));


    }
}