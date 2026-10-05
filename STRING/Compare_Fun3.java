package STRING;

public class Compare_Fun3 {
    public static void main(String[] args) {
        String password = "Java123";
        String input = "java123";

        if(password.equalsIgnoreCase(input)){
            System.out.println("Password matched");
        } else {
            System.out.println("Password did not matched");
        }
    }
}
