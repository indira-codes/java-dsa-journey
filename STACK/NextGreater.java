package STACK;

public class NextGreater {
    
    static void printGreater(int[] arr){

        // Traverse every element
        for(int i=0; i<arr.length; i++){

            // Assume no greater element exists
            int nextGreaterEle = -1;

            // search on the right side
            for(int j = i+1; j < arr.length; j++){
                // found the first greater element

                if(arr[j] > arr[i]){
                    nextGreaterEle = arr[j];
                    break;
                }
            }

            // Print the answer
            System.out.print(nextGreaterEle + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,15,10,8,6,12,7};

        printGreater(arr);
    }
}
