package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class BurgerTest {

    @Mock
    Bun bun;
    Ingredient testIngredient1 = Mockito.mock(Ingredient.class);
    Ingredient testIngredient2 = Mockito.mock(Ingredient.class);

    @Test
    public void setBunsTest() {

        Burger burger = new Burger();
        burger.setBuns(bun);
        assertEquals(bun, burger.bun);

    }

    @Test
    public void addIngredientTest() {
        Burger burger = new Burger();
        burger.addIngredient(testIngredient1);
        List<Ingredient> expected = new ArrayList<>();
        expected.add(testIngredient1);
        assertEquals(expected, burger.ingredients);
    }

    @Test
    public void removeIngredientTest() {
        Burger burger = new Burger();
        System.out.println(testIngredient1);
        burger.addIngredient(testIngredient1);
        burger.removeIngredient(0);
        List<Ingredient> expected = new ArrayList<>();
        assertEquals(expected, burger.ingredients);
    }

    @Test
    public void moveIngredientTest() {
        Burger burger = new Burger();
        burger.addIngredient(testIngredient1);
        burger.addIngredient(testIngredient2);
        burger.moveIngredient(0,1);
        List<Ingredient> expected = new ArrayList<>();
        expected.add(testIngredient2);
        expected.add(testIngredient1);
        assertEquals(expected, burger.ingredients);
    }

    @Test
    public void getPriceTest() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(testIngredient1);
        burger.addIngredient(testIngredient2);
        Mockito.when(bun.getPrice()).thenReturn(100f);
        Mockito.when(testIngredient1.getPrice()).thenReturn(150f);
        Mockito.when(testIngredient2.getPrice()).thenReturn(75f);
        assertEquals(425, burger.getPrice(), 0.0);
    }

    @Test
    public void getReceiptTest() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(testIngredient1);
        burger.addIngredient(testIngredient2);
        Mockito.when(bun.getName()).thenReturn("TestBun");
        Mockito.when(bun.getPrice()).thenReturn(100f);

        Mockito.when(testIngredient1.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(testIngredient1.getPrice()).thenReturn(150f);
        Mockito.when(testIngredient1.getName()).thenReturn("TestIngredient 1");

        Mockito.when(testIngredient2.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(testIngredient2.getPrice()).thenReturn(75f);
        Mockito.when(testIngredient2.getName()).thenReturn("TestIngredient 1");

        String expected = "(==== TestBun ====)\r\n" +
                "= sauce TestIngredient 1 =\r\n" +
                "= filling TestIngredient 1 =\r\n" +
                "(==== TestBun ====)\r\n" +
                "\r\n" +
                "Price: 425,000000\r\n";
        assertEquals(expected, burger.getReceipt());
    }
}