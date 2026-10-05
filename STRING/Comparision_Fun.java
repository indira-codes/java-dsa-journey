package STRING;

public class Comparision_Fun {
    
    public static void main(String[] args) {
        // case 1
        String s1 = "Nitu";
        String s2 = "Nitu";
        // case2
        String s3 = new String("Nitu"); //if we compare s1 or s2 with s3 then it will give false even if their content is same because new creates a different object both reference are different.

        if(s1 == s3){
            // it compares the references not content inside the variable. it return true/false.
            System.out.println("Names are same.");
        } else {
            System.out.println("Names are not same.");
        }
    }
}
