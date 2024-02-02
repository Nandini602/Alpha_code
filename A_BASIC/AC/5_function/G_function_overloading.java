
// function overloading
import java.util.*; 

public class G_function_overloading{ 

    public static int  sum(int a , int b ){
          int sum1 = a+b; 
          return sum1;
    } 

    public static int sum(int a , int b, int c){ 
        int sum2 = a+b+c; 
        return sum2;

    }
    public static void main(String agrs[]){
      System.out.println(sum(3,5)); 
      System.out.println(sum(1,2,3));

    }
}