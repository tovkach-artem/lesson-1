import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class AnotherTest {

    @Test
    public void shouldBeAbleToConfigureTestsFormDifferentClasses() {
        Assert.fail("Другой класс");
    }

    @Test
    public void test() {
        Assertions.assertThat("test").isEqualTo("test1");
    }


}
