import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedHasMane;
    private String expectedException = "Используйте допустимые значения пола животного - самец или самка";

    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.expectedHasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Котенок", false} // Проверьте, как должен обрабатываться этот случай
        };
    }

    @Test
    public void checkWhenLeonHasMane() throws Exception {
        try {
            Lion lion = new Lion(sex); // Предполагаем, что в конструкторе Lion передаётся только пол
            boolean actualHasMane = lion.doesHaveMane();
            Assert.assertEquals(expectedHasMane, actualHasMane);
        } catch (Exception exception) {
            Assert.assertEquals(expectedException, exception.getMessage());
        }
    }
}