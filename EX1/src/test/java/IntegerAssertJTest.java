import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class IntegerAssertJTest {
    @Test
    void shouldHaveEqualsValue() {
        int a = 100;
        int b = 100;
        // AssertJ: verifica que los valores son iguales
        assertThat(a).isEqualTo(b);
    }

    @Test
    void shouldHaveDifferentValues() {
        Integer a = 100;
        Integer b = 200;
        // AssertJ: verifica que los valores son diferentes
        assertThat(a).isNotEqualTo(b);
    }


}
