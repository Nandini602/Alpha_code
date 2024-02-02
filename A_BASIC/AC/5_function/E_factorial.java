
// find the factorial of the value
import java.util.*; 

public class E_factorial{

    public static int fact( int n){
        int f = 1; 

        for(int i =1;i<=n ; i++){
            f = f * i ; 
        } 
        return f ;
    }
    public static void main(String args[]){ 
        System.out.println("plz enter  the number");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
         int solution = fact(n);  
         System.out.println(solution);

    }
}