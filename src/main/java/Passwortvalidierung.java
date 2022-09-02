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
            Message = "Fehlende Groß- und Kleinschreibung im Passwort";
        }else if (length >= 8 && !containsNumber && containUpAndLow) {
            Message = "Fehlende Zahl im Passwort.";
        }else if (length >=8 && !containsNumber && !containUpAndLow) {
            Message = "Fehlende Zahl,  Groß- und Kleinschreibung im Passwort";
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
}
