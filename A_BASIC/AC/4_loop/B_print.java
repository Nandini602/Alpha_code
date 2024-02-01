
// print the number from  1 to 10 

import java.util.*;
public class B_print{
    public static void main(String args[]){
        System.out.println("using while loop");
        int i = 1; 
        while(i <= 10){
            System.out.println(i); 
            i ++;
        }  

        System.out.println("using for loop");

        for(int k = 1;k<= 10;k++){
            System.out.println(k);
        } 

        System.out.println("using do while loop"); 
        int j =1; 
        do{
            System.out.println(j);
            j++;
        }while(j<=10); 
        
    }
}