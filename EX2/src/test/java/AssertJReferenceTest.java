import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertJReferenceTest {

    @Test
    void referencesAreTheSame() {
        String s1= "Hello";
        String s2 = s1;
        String s3 = new String("Hello");
        assertThat(s1).isSameAs(s2);
        assertThat(s1).isNotSameAs(s3);
    }
}
