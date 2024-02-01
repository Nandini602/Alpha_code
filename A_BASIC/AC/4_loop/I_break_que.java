
// keep entering numbers till user enters  a multiple of 10 


import java.util.*;
public class I_break_que{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in); 
            
        //   do{
        //     System.out.print("enter the number"); 
        //     int n = sc.nextInt(); 
        //     if(n % 10 == 0){
        //         break;
        //     } 
        //     System.out.println(n);
        //   }while(true); 
          

          for( ;  ; ){ 
            System.out.println("plz enter the number");
            int n = sc.nextInt(); 
            if(n % 10 == 0){
                break;
            } 
            System.out.println(n);

          }

    }
}