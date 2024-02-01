

import java.util.*; 
public class G_do_while{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int counter = 1; 
        do{
            System.out.println(counter);
            counter ++;
        }while(counter <= n);
    }
}