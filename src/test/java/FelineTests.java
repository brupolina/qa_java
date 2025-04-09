import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Test
    public void checkThatFelineEatsMeatTest() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), new Feline().eatMeat());
    }

    @Test
    public  void checkThatFelineGetFamilyTest() {
        Assert.assertEquals("Кошачьи", new Feline().getFamily());
    }

    @Test
    public void checkCountOfKittensMoreWhenOneTest() {
        Assert.assertEquals(5, new Feline().getKittens(5));
    }

    @Test
    public void checkCountOfKittensIsOneTest() {
        Feline feline = new Feline();
        Assert.assertEquals(feline.getKittens(1),feline.getKittens());
    }
}