package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class IngredientParameterizedTest {

    private final IngredientType type;

    public IngredientParameterizedTest(IngredientType type) {
        this.type = type;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                { IngredientType.SAUCE},
                { IngredientType.FILLING}
        };
    }

    @Test
    public void getTypeParameterizedTest() {
        Ingredient ingredient = new Ingredient(type, "TestIngredient", 123);
        assertNotNull(ingredient.getType());
    }
}