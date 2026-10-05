package STRING;

public class Compare_Fun2 {
    public static void main(String[] args) {
        String s1 = "Priya";
        String s2 = "Priya";
        // CASE-1
        String s3 = new String("Priya");
        // CASE-2
        String s4 = new String("priya");

        // .equals() method in string only compares the content the variable hold it doesn't care about the reference. but java is case sensitive . for different case java consider the same character as different one.
        if(s1.equals(s4)){
            System.out.println("Names are same");
        } else {
            System.out.println("Names are different");
        }
    }
}
