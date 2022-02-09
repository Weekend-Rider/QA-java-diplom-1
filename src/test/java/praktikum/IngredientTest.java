package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

public class IngredientTest {

    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "TestIngredient", 123);

    @Test
    public void getPriceTest() {

        float actual = ingredient.getPrice();
        float expected = 123.0f;
        assertEquals(expected, actual,0.0);

    }

    @Test
    public void getNameTest() {

        String actual = ingredient.getName();
        String expected = "TestIngredient";
        assertEquals(expected, actual);

    }

}