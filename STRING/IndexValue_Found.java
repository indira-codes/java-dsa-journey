package STRING;

public class IndexValue_Found {
    public static void main(String[] args) {
        String str = "banana";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a') {
                count++;
            }
        }

        System.out.println("Number of a's: " + count);

    }
}
