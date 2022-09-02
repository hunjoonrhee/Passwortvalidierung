public class Passwortvalidierung {
//    public static void main(String[] args) {
//        String password = "pass";
//        getLength(password);
//    }
    public static int getLength(String password){
        int length = password.length();
        return length;
    }

    public static String checkLength(String password){
        int length = getLength(password);
        String Message = null;
        boolean containsNumber = checkNumber(password);
        if(length >=8 && containsNumber){
            Message = "Passwort akzeptiert.";
        } else if (length >= 8 && !containsNumber) {
            Message = "Fehlende Zahl im Passwort.";
        } else{
            Message = "Passwort zu kurz!";
        }
        return Message;
    }

    public static boolean checkNumber(String password){
        boolean containsNumber;
        int number = 1;
        password.contains(String.valueOf(number));
        if(eine Zahl ist vorhanden){
            containsNumber = true;
        }else{
            containsNumber = false;
        }
        return containsNumber;
    }
String password = "ABCD1234";
}
