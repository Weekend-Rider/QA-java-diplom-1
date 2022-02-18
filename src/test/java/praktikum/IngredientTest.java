package praktikum;

import org.junit.Test;

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