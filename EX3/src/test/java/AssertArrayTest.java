import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertArrayTest {
    @Test
    void integerArraysAreIdentical() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};

        assertThat(expected).containsExactly(actual);
    }
}
