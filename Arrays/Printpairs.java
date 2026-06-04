/*
PSEUDOCODE

1. Initialize totalPairs = 0

2. For each element i from 0 to n-1
    current = arr[i]

    For each element j from i+1 to n-1
            Print (current, arr[j])
            totalPairs++

    Print new line

3. End

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class Printpairs {
    public static void printPairs(int arr[]){
        int totalpairs=0;
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                totalpairs++;
            }
            System.out.println();
        }

        System.out.println("Total Pairs = " + totalpairs);
    }

    public static void main(String[]args){
        int arr[]={2,4,6,8,10};
        printPairs(arr);
    }
}
