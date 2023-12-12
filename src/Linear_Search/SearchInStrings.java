package Linear_Search;

public class SearchInStrings {
    public static void main(String[] args) {
        String text = "vishnu";
        char target  = 's';
        boolean answer = search(text, target);
        System.out.println(answer);
    }

    // Return true or false if char is found in text
    static boolean search(String text, char target){
        if(text.length() == 0){
            return false;
        }
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    // Return true or false if char is found in text

    static boolean search2(String text, char target){
        if(text.length() == 0){
            return false;
        }
        for(char i : text.toCharArray()){
            if(i == target){
                return true;
            }
        }
        return false;
    }
}
