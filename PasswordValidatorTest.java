import org.junit.Assert.*;
import org.junit.jupiter.api.Test;



public class PasswordValidatorTest {

    PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    void testPasswordLessThan8Characters() {
        Assertions.assertFalse(passwordValidator.isValid("1234567"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        Assertions.assertFalse(passwordValidator.isValid("abcdefg1!"));
    }

    @Test
    void testPasswordWithoutLowercase() {
        Assertions.assertFalse(passwordValidator.isValid("ABCDEFG1!"));
    }

    @Test
    void testPasswordWithoutDigit() {
        Assertions.assertFalse(passwordValidator.isValid("Abcdefg!"));
    }

    @Test
    void testPasswordWithoutSpecialCharacter() {
        Assertions.assertFalse(passwordValidator.isValid("Abcdefg1"));
    }

    @Test
    void testValidPassword() {
        Assertions.assertTrue(passwordValidator.isValid("Abcdefg1!"));
    }
}
