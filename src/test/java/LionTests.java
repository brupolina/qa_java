import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTests {
    @Test
    public void checkThatLionHasOneKitten() throws Exception {
        Lion lion = new Lion(new Feline(), "Самка");
        Assert.assertEquals("У львов один детёныш", 1, lion.getKittens());
    }

    @Test
    public void checkThatLionHasFoodLikeFeline() throws Exception {
        Lion lion = new Lion(new Feline(), "Самец");
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыбы"), lion.getFood());
    }
}