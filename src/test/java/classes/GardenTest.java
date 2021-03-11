package classes;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertThrows;

import org.testng.annotations.Test;

public class GardenTest {

    @Test
    public void constructorTest() {
        // Constructor 1
        Garden garden = new Garden();

        assertEquals(garden.get_seed(), 0);
        assertEquals(garden.get_maxCapacity(), 20);
        assertTrue(garden.get_vegetables().isEmpty());

        // Constructor 2
        Garden garden2 = new Garden(10);

        assertEquals(garden2.get_maxCapacity(), 10);
    }

    @Test
    public void set_vegetablesTest() throws Exception {
        Garden garden = new Garden();

        // Normal case + upper/lowercase
        garden.set_vegetables("Tomato", 3);
        int tomato = garden.get_vegetables().get("tomato");

        assertEquals(tomato, 3);

        // Exception case
        assertThrows(() -> garden.set_vegetables("cuncumber", 5));
    }

}