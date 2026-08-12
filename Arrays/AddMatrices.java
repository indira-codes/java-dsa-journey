package Arrays;

public class AddMatrices {
    public static void main(String [] args){

        int [][] A = {
            {1,2},
            {3,4}
        };

        int [][] B = {
            {5,6},
            {7,8}
        };

        int [][] C = new int[2][2];

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < C[i].length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
