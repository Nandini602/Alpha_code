
// print the sum of first n natural numbers 

import java.util.*; 
public class C_sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int sum = 0 ; 
        for(int i =1;i<=n;i++){
            sum = sum + i; // remember
        }
        System.out.println(sum); 


        /*int j =1;
        while(j<=n){
            sum = sum+j;
            j++;
        }
         System.out.println(sum);   

        */ 

    //    int k =1; 
    //    do{
    //      sum = sum +k;
    //      k++;
    //    }while(k<=n);
    //     System.out.println(sum); 


    }
}