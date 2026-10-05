package STRING;

public class Compare_Fun4 {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Banana";

        int result = s1.compareTo(s2);

        // System.out.println(result);

        if (result < 0) {
            System.out.println("Apple comes before Banana");
        } else if (result > 0) {
            System.out.println("Apple comes after Banana , so it gives -1 . it follows lexicographical order");
        } else {
            System.out.println("Both are equal");
        }
    }
}
