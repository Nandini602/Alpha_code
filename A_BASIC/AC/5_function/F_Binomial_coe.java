 

 // find  the binomial coefficient of the give number 

// n = 5 . r = 2 

 import java.util.*; 
 public class F_Binomial_coe{ 

    public static int fact(int n){
        int  f = 1; 
         for(int i =0;i<=n; i++){
             f = f * i;
         } 
         return f;
    }  

    public static int bino(int n , int r){
        int  fn = fact(n); 
        int fr = fact(r); 
        int fnr = fact(n-r); 

        int bino  = fn/(fr * fnr); 
        return bino;
    }


    public static void main(String args[]){
        System.out.println(bino(5,2));
        // Scanner sc = new Scanner(System.in);   
        // int  n = sc.nextInt(); 
        // int r = sc.nextInt();  

       

        // int bino = fn / (fr * fnr); 
        // System.out.println(bino);
     }
 }  