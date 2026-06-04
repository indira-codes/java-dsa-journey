/*
START

FUNCTION reverse(arr)

    first = 0
    last = length(arr) - 1

    WHILE first < last

        temp = arr[last]
        arr[last] = arr[first]
        arr[first] = temp

        first = first + 1
        last = last - 1

    END WHILE

END FUNCTION

CREATE array arr = [2, 4, 6, 8, 10]

CALL reverse(arr)

FOR i = 0 TO length(arr) - 1
    PRINT arr[i]
END FOR

STOP
*/


import java.util.*;

public class ReverseArr {
    public static void reverse(int arr[]){
        int first = 0 , last = arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args){
        int arr[] = {2,4,6,8,10};
        reverse(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
    }
    
}

