// check if a student will pass or fail 

import java.util.*; 

public class H_check_mrk{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in); 
           System.out.println("plz enter the mrks");
        int marks = sc.nextInt();  
        //System.out.println("plz enter the mrks");

        String ans = (marks >= 33)? "pass" : "fail"; 
        System.out.println(ans);
    }
}