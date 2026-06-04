/*
PSEUDOCODE

1. Initialize totalSubArrays = 0

2. For each index i from 0 to n-1
    start = i

    For each index j from i to n-1
            end = j

            For each index k from start to end
                Print arr[k]

            totalSubArrays++
            Print new line

    Print new line

3. Print totalSubArrays

Time Complexity: O(n³)
Space Complexity: O(1)
*/

public class PrintSubArrays {
    
    public static void printSubArrays(int arr[]){

        int ts=0;

        for(int i=0; i<arr.length; i++){
            int start=i;
            
            for(int j=i; j<arr.length; j++){
                int end=j;
                int subarrSum=0;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k] + " ");
                    subarrSum += arr[k];
                    
                }
                System.out.print(" Sum = " + subarrSum);
                ts++;
                System.out.println();
            }
            
            System.out.println();
        }
        System.out.println("TotalSubArrays = " + ts);

    }

    public static void main(String[]args){
        int arr[]={2,4,6,8,10};
        printSubArrays(arr);
        
    }
}
