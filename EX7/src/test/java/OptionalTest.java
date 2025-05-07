

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalTest {

    @Test
    void shouldBeEmptyOptional() {
        Optional<Object> emptyOptional = Optional.empty();
        //Error Optional<String> optional = Optional.of("Hello");

        //  Verifica que está vacío
        assertThat(emptyOptional).isEmpty();
    }
}
