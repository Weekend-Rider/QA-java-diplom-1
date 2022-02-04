package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class BunTest {

    @Mock
    Bun bun;
    String name;
    float price;

    @Test
    public void testGetName() {
        Mockito.when(bun.getName()).thenReturn("Name");
        String actual = bun.getName();
        String expected = "Name";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetName2() {
        Bun bun = new Bun("Name",price);
        String actual = bun.getName();
        String expected = "Name";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPrice() {
        Mockito.when(bun.getPrice()).thenReturn(100f);
        float actual = bun.getPrice();
        float expected = 100f;
        assertEquals(expected, actual, 0);
    }
}