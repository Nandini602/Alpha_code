
import java.util.*; 
public class H_break{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        for(int i=0;i<=n;i++){
            if(i == 5){
                break;
            } 
            System.out.println(i);
        }
    }
}
