import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTests {
    @Test
    public void checkThatLionHasOneKittenTest() throws Exception {
        Lion lion = new Lion(new Feline(), "Самка");
        Assert.assertEquals("У львов один детёныш", 1, lion.getKittens());
    }

    @Test
    public void checkThatLionHasFoodLikeFelineTest() throws Exception {
        Lion lion = new Lion(new Feline(), "Самец");
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void checkWhenLeonHasManeTest() throws Exception {
        String expectedExceptionMessage = "Используйте допустимые значения пола животного - самец или самка";
        Feline feline = new Feline();
        @SuppressWarnings("unchecked")
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion(feline,"Котенок"));
        Assert.assertEquals(expectedExceptionMessage, exception.getMessage());
    }
}