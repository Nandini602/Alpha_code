//brute force apporach  

//search the key in the sorted array

public class F_search {  

    public static boolean search(int arr[][],int key){

        int row= 0, col=arr[0].length-1; 

        while(row<arr.length && col>=0){
            if(arr[row][col] == key){
                System.out.println("found key at (" + row + " ," + col + ")"); 
                return true;
            } 
            else if(key< arr[row][col]){
                col--;
            } 

            else{
                row++;
            } 
        } 

        System.out.println("key not found !");
        return false;

    }
    public static void main(String args[]){
        int arr[][] ={ {1,2,3,4},
                        {5,6,7,8},
                    {9,10,11,12}}; 

                    int key = 5;
        search(arr,key);
    }
    
}
