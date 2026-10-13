package LEETCODE;

public class RemoveZeros {
    
    public static long removeZeros(long n) {

        long result = 0;
        long place = 1;

        while (n > 0) {

            // Extract the last digit
            long digit = n % 10;

            // Include only non-zero digits
            if (digit != 0) {
                result += digit * place;
                place *= 10;
            }

            // Remove the last digit
            n = n / 10;
        }

        return result;
    }

    public static void main(String[] args) {

        long n = 1020030L;

        long answer = removeZeros(n);

        System.out.println("Original number: " + n);
        System.out.println("Number after removing zeros: " + answer);
    }
}


