package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class BunTest {

    Bun bun = new Bun("Name",123.0f);

    @Test
    public void getNameTest() {

        String actual = bun.getName();
        String expected = "Name";
        assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest() {

        float actual = bun.getPrice();
        float expected = 123.0f;
        assertEquals(expected, actual,0.0);
    }

}