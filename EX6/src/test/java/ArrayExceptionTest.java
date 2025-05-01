import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class ArrayExceptionTest {
    @Test
    void shouldThrowArrayIndexOutOfBoundsException() {
        int[] numbers = {1, 2, 3};

        // Verificamos que acceder fuera de los límites lanza la excepción esperada
        assertThatThrownBy(() -> {
            int value = numbers[5]; // índice fuera de rango
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
