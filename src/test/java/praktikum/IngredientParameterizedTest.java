package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class IngredientParameterizedTest {

    private final IngredientType type;
    //private final Matcher<Object> expected;

    public IngredientParameterizedTest(IngredientType type/*, Matcher<Object> expected*/) {

        this.type = type;
        //this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                { IngredientType.SAUCE},
                { IngredientType.FILLING}
                //{ null}
        };
    }

    @Test
    public void getTypeParameterizedTest() {
        Ingredient ingredient = new Ingredient(type, "TestIngredient", 123);
        //IngredientType actual = ingredient.getType();
        System.out.println(type);
        assertNotNull(ingredient.getType());
        //assertEquals(expected, actual);
    }
}