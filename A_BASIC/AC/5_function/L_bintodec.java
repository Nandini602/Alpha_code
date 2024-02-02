

import java.util.*; 

public class L_bintodec{

    public  static void binToDec(int binNum){
        int pow = 0 ; 
        int decNew = 0 ; 

        while(binNum >= 0){
            int lastDigit = binNum % 10; 
            decNum = decNum + (lastdigit  *(int)Math.pow(2,pow));
        }
    }
}