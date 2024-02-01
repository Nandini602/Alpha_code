
// print the largest betwwen 3 number 

import java.util.*;
public class F_largest{
    public static void main(String args[]){
        int a = 1 , b = 3 , c = 6;
        if (a >= b && a >= c){
            System.out.println("a is largest");
        }
        else if (b >= a &&  b >= c){ 
            System.out.println("b is lagrest");
        } 
        else{
             System.out.println("c  is largest");
        }
    }
}