package classes.Vegetables;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class VegetableTest {

    @Test
    public void testConstructor() {
        Vegetable vegetable = new Vegetable();
        Tomato tomato = new Tomato();
        Pickle pickle = new Pickle();
        Carrot carrot = new Carrot();

        unit_test_constructor(vegetable, "none");
        unit_test_constructor(tomato, "tomato");
        unit_test_constructor(pickle, "pickle");
        unit_test_constructor(carrot, "carrot");
    }

    @Test
    public void testGrow() {

        // Generic case - First add
        Vegetable vegetable = new Vegetable();
        vegetable.grow(6);
        assertEquals(vegetable.get_seed(), 6);

        // Generic case - Addition
        vegetable.grow(4);
        assertEquals(vegetable.get_seed(), 10);

        // Sub class - First add
        Tomato tomato = new Tomato();
        tomato.grow(6);
        assertEquals(tomato.get_seed(), 6);

        // Sub class - Addition
        tomato.grow(4);
        assertEquals(tomato.get_seed(), 10);
    }

    private void unit_test_constructor(Vegetable vegetable, String type) {
        assertEquals(vegetable.get_seed(), 0);
        assertEquals(vegetable.get_type(), type);
    }
}