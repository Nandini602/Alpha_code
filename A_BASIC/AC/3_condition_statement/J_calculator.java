
// calculator + ,-,*, /,% 

import java.util.*;
public class J_calculator{
    public static void main(String args[]){
        System.out.println("enter a and  b");
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        System.out.println("enter the operand"); 
        String ch = sc.next(); 

        switch(ch){
            case "+" : 
            System.out.println( "addition  " + (a + b)); 
            break; 
            case "-": 
            System.out.println("substraction " + (a -b)    ); 
            break;

            case "*": 
            System.out.println("multiplication" + (a * b));
            break; 

            case "/" : 
            System.out.println("divide" + (a /b)); 
            break; 

            case "%": 
            System.out.println("module" + (a % b));
            break; 

            default: 
            System.out.println("you enter nothing ");

        }
    }
}