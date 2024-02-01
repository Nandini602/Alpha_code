


import java.util.*;

public class J_contineue{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        for(int i = 1 ; i<=n;i++){
            if(i == 5){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}