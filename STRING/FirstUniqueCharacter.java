package STRING;

public class FirstUniqueCharacter {
    
    public static char firstUniqueCharacter(String str){

        for(int i = 0; i < str.length(); i++){
            
            boolean duplicate = false;

            for(int j = i+1; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate){
                return str.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "swiss";

        char result = firstUniqueCharacter(str);

        if(result == '\0'){
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
