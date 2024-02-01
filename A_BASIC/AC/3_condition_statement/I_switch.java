
import java.util.*; 
public class I_switch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        int number = sc.nextInt();

        switch(number){
            case 1 :
                System.out.println("enter the one");
                break; 
            case 2 : 
                System.out.println("enter the two");
                break; 
            
            case 3 :
                System.out.println("enter the three");
                break; 


            default :
              System.out.println("you not enter the right number") ;

        }
    }
}