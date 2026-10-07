package STACK;

public class PreviousGreater {
    
    static void printGreater(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int previousGreaterEle = -1;

            for(int j = i-1; j >= 0; j--){
                if(arr[j] > arr[i]){
                    previousGreaterEle = arr[j];
                    break;
                }
            }

            System.out.print(previousGreaterEle + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,10,20,30,40,50,60,70};

        printGreater(arr);
    }
}
