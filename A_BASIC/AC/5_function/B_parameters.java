
import java.util.*;


public class B_parameters{ 

    
    public static int calsum(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String args[]){
        System.out.println("plz,enter the value of a , b");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        int  sum = (calsum(a,b));
        System.out.println(sum);
    }
}