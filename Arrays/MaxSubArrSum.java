
/* Maximum Subarray Sum (Brute Force)

This program finds the maximum subarray sum using 
the brute-force approach. It generates all possible subarrays, 
calculates their sums, and tracks the largest sum encountered.

Features:
Generates all possible subarrays.
Calculates the sum of each subarray.
Finds the maximum subarray sum.
Prints each subarray along with its sum.

Approach:
Select a starting index.
Select an ending index.
Traverse the subarray and calculate its sum.
Compare the current sum with the maximum sum found so far.
Update the maximum sum if needed.
*/







public class MaxSubArrSum {

    public static void maxSubArrSum(int arr[]){

        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int start=i;
            
            for(int j=i; j<arr.length; j++){
                int end=j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k] + " ");
                    currSum += arr[k];
                    
                }
                System.out.println(currSum);
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }    
    }
        System.out.println("MaxSubArraysSum = " + maxSum);

    }

    public static void main(String[]args){
        int arr[]={1,-2,6,-1,3};
        maxSubArrSum(arr);
        
    }
}
