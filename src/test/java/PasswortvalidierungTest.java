import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswortvalidierungTest {

    @Test
    void getLengthTest(){
        // GIVEN
        String password = "password";
        // WHEN
        int actual = Passwortvalidierung.getLength(password);

        // THEN
        assertEquals(8, actual);
    }

    @Test
    void checkPasswordTestForForbiddenPassword(){
        // GIVEN
        String password = "Password1";
        // WHEN
        String actual = Passwortvalidierung.checkPassword(password);

        // THEN
        assertEquals("Passwort verboten.", actual);
    }

    @Test
    void checkPasswordTestForLonger8NumberUpperLower(){
        // GIVEN
        String password = "paSsword1";
        // WHEN
        String actual = Passwortvalidierung.checkPassword(password);

        // THEN
        assertEquals("Passwort akzeptiert.", actual);
    }
    @Test
    void checkPasswordTestForLonger8NoAlphabets(){
        // GIVEN
        String password = "12345678";
        // WHEN
        String actual = Passwortvalidierung.checkPassword(password);

        // THEN
        assertEquals("Fehlende Groß- und Kleinschreibung im Passwort.", actual);
    }

    @Test
    void checkPasswordTestForLonger8NumberNoUpperLower(){
        // GIVEN
        String password = "password1";
        // WHEN
        String actual = Passwortvalidierung.checkPassword(password);

        // THEN
        assertEquals("Fehlende Groß- und Kleinschreibung im Passwort.", actual);
    }
    @Test
    void checkPasswordTestForLonger8NoNumberNoUpperLower(){
        // GIVEN
        String password = "password";
        // WHEN
        String actual = Passwortvalidierung.checkPassword(password);

        // THEN
        assertEquals("Fehlende Zahl,  Groß- und Kleinschreibung im Passwort.", actual);
    }
    @Test
    void checkPasswordTestForShorter8(){
        // GIVEN
        String password = "pass123";
        // WHEN
        String actual = Passwortvalidierung.checkPassword(password);

        // THEN
        assertEquals("Passwort zu kurz!", actual);
    }

    @Test
    void checkNumberTestFor0(){
        // GIVEN
        String password = "password0";
        // WHEN
        boolean actual = Passwortvalidierung.checkNumber(password);

        // THEN
        assertEquals(true, actual);
    }
    @Test
    void checkNumberTestFor10(){
        // GIVEN
        String password = "password10";
        // WHEN
        boolean actual = Passwortvalidierung.checkNumber(password);

        // THEN
        assertEquals(true, actual);
    }
    @Test
    void checkNumberTestForNoNumber(){
        // GIVEN
        String password = "password";
        // WHEN
        boolean actual = Passwortvalidierung.checkNumber(password);

        // THEN
        assertEquals(false, actual);
    }

    @Test
    void checkUpperLowerTest(){
        // GIVEN
        String password = "passWord";
        // WHEN
        boolean actual = Passwortvalidierung.checkUpperLower(password);

        // THEN
        assertEquals(true, actual);
    }

    @Test
    void checkUpperLowerTestOnlyUpper(){
        // GIVEN
        String password = "PASSWORD";
        // WHEN
        boolean actual = Passwortvalidierung.checkUpperLower(password);

        // THEN
        assertEquals(false, actual);
    }

    @Test
    void checkUpperLowerTestOnlyLower(){
        // GIVEN
        String password = "password";
        // WHEN
        boolean actual = Passwortvalidierung.checkUpperLower(password);

        // THEN
        assertEquals(false, actual);
    }

    @Test
    void isPasswordBannedTest(){
        // GIVEN
        String password = "Password1";
        // WHEN
        boolean actual = Passwortvalidierung.isPasswordBanned(password);

        // THEN
        assertEquals(true, actual);
    }
}
