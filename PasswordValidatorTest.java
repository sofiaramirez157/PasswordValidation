import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    void testPasswordLessThan8Characters() {
        String resultado = passwordValidator.validate("1234567");
        Assertions.assertEquals("La contraseña debe de contener al menos 8 letras", resultado);
    }

    @Test
    void testPasswordWithoutUppercase() {
        String resultado = passwordValidator.validate("abcdefg1!");
        Assertions.assertEquals("La contraseña debe de contener al menos una letra mayúscula.", resultado);
    }

    @Test
    void testPasswordWithoutLowercase() {
        String resultado = passwordValidator.validate("ABCDEFG1!");
        Assertions.assertEquals("La contraseña debe de contener al menos una letra minúscula.", resultado);
    }

    @Test
    void testPasswordWithoutDigit() {
        String resultado = passwordValidator.validate("Abcdefg!");
        Assertions.assertEquals("La contraseña debe contener al menos un dígito.", resultado);
    }

    @Test
    void testPasswordWithoutSpecialCharacter() {
        String resultado = passwordValidator.validate("Abcdefg1");
        Assertions.assertEquals("La contraseña debe contener al menos un carácter especial.", resultado);
    }

    @Test
    void testValidPassword() {
        String resultado = passwordValidator.validate("Abcdefg1!");
        Assertions.assertEquals("Contraseña válida", resultado);
    }
}
