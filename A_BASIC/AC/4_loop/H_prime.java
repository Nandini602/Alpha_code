
// check if the number is prime  no not  

import java.util.*; 
public class H_prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();  // number that we have to check 

        boolean isprime = true; 
        for(int i =2;i<= n-1;i++){ // for(int i =2 ; i<= Math.sqrt(n); i++)
            if(n % i == 0){
                isprime = false;
            }
        } 

        if(isprime == true){
            System.out.println( n  + "is prime number");
        }else{
            System.out.println(n  + "is not the prime number");
        }

        
    }
}