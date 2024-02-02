
import java.util.*; 

public class D_product{ 

    public static  int product(int a , int b){
        int product = a*b; 
        return product;
       // System.out.println(product);
    }
    public static void main(String args[]){ 
        System.out.println("plz enter the number");
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

      System.out.println(product(a,b));
    }
}