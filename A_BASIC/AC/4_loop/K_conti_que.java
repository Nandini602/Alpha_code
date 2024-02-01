// display all numbers entered by user except multiples of 10
import java.util.*;

public class K_conti_que{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in); 
        for( ; ; ){

            System.out.print(" plz  enter the number   ");
             int n = sc.nextInt(); 
             if(n % 10 == 0) {
                continue;
             } 
             System.out.println( "your number was " + n);
        }

    }
}