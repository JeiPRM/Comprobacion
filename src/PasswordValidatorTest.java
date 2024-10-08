import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    public void testValidPassword() {
        // Comprobar que una contraseña válida pasa
        assertTrue(PasswordValidator.isValid("Password123"));
    }

    @Test
    public void testInvalidPassword() {
        // Comprobar que una contraseña inválida no pasa
        assertFalse(PasswordValidator.isValid("&"));
    }
}
