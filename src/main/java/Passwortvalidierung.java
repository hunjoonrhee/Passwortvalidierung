import java.util.ArrayList;
import java.util.Scanner;

public class Passwortvalidierung {
    public static void main(String[] args) {
        System.out.println("Geben Sie ein Passwort ein:");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println(checkPassword(password));
    }
    public static int getLength(String password){
        int length = password.length();
        return length;
    }

    public static String checkPassword(String password){
        String Message = null;
        boolean isPasswordBanned = isPasswordBanned(password);
        int length = getLength(password);
        boolean containsNumber = checkNumber(password);
        boolean containUpAndLow = checkUpperLower(password);

        if(isPasswordBanned){
            Message = "Passwort verboten.";
        }else{
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
        return containLow && containUp;
    }

    public static boolean isPasswordBanned(String password){
        ArrayList<String> BannedPasswords = new ArrayList<>();
        BannedPasswords.add("Password1");
        BannedPasswords.add("Password2");
        BannedPasswords.add("ABcd1234");
        BannedPasswords.add("Ab123456");

        return BannedPasswords.contains(password);
    }
}
