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
    void checkLengthTestForLonger8(){
        // GIVEN
        String password = "password1";
        // WHEN
        String actual = Passwortvalidierung.checkPassword(password);

        // THEN
        assertEquals("Passwort akzeptiert.", actual);
    }
    @Test
    void checkLengthTestForLonger8AndNoNumber(){
        // GIVEN
        String password = "password";
        // WHEN
        String actual = Passwortvalidierung.checkPassword(password);

        // THEN
        assertEquals("Fehlende Zahl im Passwort.", actual);
    }
    @Test
    void checkLengthTestForShorter8(){
        // GIVEN
        String password = "pass123";
        // WHEN
        String actual = Passwortvalidierung.checkPassword(password);

        // THEN
        assertEquals("Passwort zu kurz!", actual);
    }

    @Test
    void checkLengthTestForShorter8AndNoNumber(){
        // GIVEN
        String password = "pass";
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


}
