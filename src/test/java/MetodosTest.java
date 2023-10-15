import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MetodosTest {
    @Test
    public void testEsStringValido() {
        StringValidator validator = new StringValidator();
        assertDoesNotThrow(() -> validator.esStringValido("validString"));
        assertThrows(ExcepcionString.class, () -> validator.esStringValido("1234"));
    }
    @Test
    public void testViajarEnMoto() {
        motocicleta moto = new motocicleta();
        assertEquals(20, moto.getDuracionviaje());
    }


}