package Sorting;

public class CountingSort {
    
    public static void countingSort(int arr[]){
        // step 1: find largest element
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // step 2: create count array
        int count[] = new int[largest+1];

        // step 3: count frequency of each element
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        // step 4: put elements back into original array
        int j = 0;

        for(int i = 0; i < count.length; i++){
            while ((count[i] > 0)) {
                arr[j] = i;
                j++;

                count[i]--;
                
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};

        System.out.println("Before Sorting:");

        for(int num : arr){
            System.out.print(num + " ");
        }

        countingSort(arr);

        System.out.println("\n\nAfter Counting Sort: ");

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
