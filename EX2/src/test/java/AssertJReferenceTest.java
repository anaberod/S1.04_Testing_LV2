import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertJReferenceTest {

    @Test
    void referencesAreTheSame() {
        Object o1= new Object();
        Object o2 = o1;
        Object o3 = new Object();
        assertThat(o1).isSameAs(o2);
        assertThat(o1).isNotSameAs(o3);
    }
}
