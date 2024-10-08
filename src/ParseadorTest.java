import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ParseadorTest {

    @Test
    void testParseadorMock() {
        // Crear un mock de la clase Parseador
        Parseador parseadorMock = Mockito.mock(Parseador.class);

        // Definir el comportamiento del mock para la ecuación "2x + 3 = 5"
        when(parseadorMock.obtenerParte1("2x + 3 = 5")).thenReturn(2);
        when(parseadorMock.obtenerParte2("2x + 3 = 5")).thenReturn(3);
        when(parseadorMock.obtenerParte3("2x + 3 = 5")).thenReturn(5);
        when(parseadorMock.obtenerOperador("2x + 3 = 5")).thenReturn("+");

        // Probar el comportamiento simulado
        assertEquals(2, parseadorMock.obtenerParte1("2x + 3 = 5"));
        assertEquals(3, parseadorMock.obtenerParte2("2x + 3 = 5"));
        assertEquals(5, parseadorMock.obtenerParte3("2x + 3 = 5"));
        assertEquals("+", parseadorMock.obtenerOperador("2x + 3 = 5"));

        // Verificar si los métodos fueron llamados
        verify(parseadorMock).obtenerParte1("2x + 3 = 5");
        verify(parseadorMock).obtenerParte2("2x + 3 = 5");
        verify(parseadorMock).obtenerParte3("2x + 3 = 5");
        verify(parseadorMock).obtenerOperador("2x + 3 = 5");
    }
}