import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    @Test
    void shouldContainKey() {
        //crear un mapa
        Map<String, String> countries = new HashMap<>();
        countries.put("France", "Paris");
        countries.put("Spain", "Madrid");
        countries.put("Germany", "Berlin");
        //verificar que contiene España
        assertThat(countries).containsKey("Portugal");


    }


}
