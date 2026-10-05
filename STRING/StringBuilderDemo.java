package STRING;

// import java.lang.StringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        // }  abcdefghijklmnopqrstuvwxyz
        // O(26)
        // O(26 * n^2)

        System.out.print(sb);

}
}
