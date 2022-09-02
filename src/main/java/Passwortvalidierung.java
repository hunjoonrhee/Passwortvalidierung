public class Passwortvalidierung {
//    public static void main(String[] args) {
//        String password = "pass";
//        getLength(password);
//    }
    public static int getLength(String password){
        int length = password.length();
        return length;
    }

    public static String checkPassword(String password){
        int length = getLength(password);
        String Message = null;
        boolean containsNumber = checkNumber(password);
        boolean containUpAndLow = checkUpperLower(password);
        if(length >=8 && containsNumber && containUpAndLow){
            Message = "Passwort akzeptiert.";
        }else if (length >=8 && containsNumber && !containUpAndLow) {
            Message = "Fehlende Groß- und Kleinschreibung im Passwort.";
        }else if (length >= 8 && !containsNumber && containUpAndLow) {
            Message = "Fehlende Zahl im Passwort.";
        }else if (length >=8 && !containsNumber && !containUpAndLow) {
            Message = "Fehlende Zahl,  Groß- und Kleinschreibung im Passwort.";
        }else{
            Message = "Passwort zu kurz!";
        }
        return Message;
    }

    public static boolean checkNumber(String password){
        boolean containsNumber=true;
        String numbers [] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for(int i = 0; i<numbers.length; i++){
            if(password.contains(numbers[i])){
                containsNumber = true;
                break;
            }else {
                containsNumber = false;
            }
        }
        return containsNumber;
    }

    public static boolean checkUpperLower(String password){
        boolean containUpAndLow;
        boolean containUp = true;
        boolean containLow = true;
        char[] c = password.toCharArray();
        for(int i=0; i<c.length; i++){
            if(Character.isUpperCase(c[i])){
                containUp = true;
                break;
            }else{
                containUp = false;
            }
        }

        for(int i=0; i<c.length; i++){
            if(Character.isLowerCase(c[i])){
                containLow = true;
                break;
            }else{
                containLow = false;
            }
        }
        if(containLow && containUp){
            containUpAndLow = true;
        }else{
            containUpAndLow = false;
        }
        return containUpAndLow;
    }
}
