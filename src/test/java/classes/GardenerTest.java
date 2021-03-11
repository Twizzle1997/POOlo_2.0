package classes;

import classes.Vegetables.*;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class GardenerTest {

    @Test
    public void testPlant_vegetable() throws Exception {
        Gardener jojo = new Gardener();

        Vegetable test_tomato;
        Vegetable test_pickle;
        Vegetable test_carrot;
        Vegetable test_tomato2;
        Vegetable test_tomato3;

        // Constructor 1
        test_tomato = jojo.plant_vegetable("tomato");
        test_carrot = jojo.plant_vegetable("carrot");
        test_pickle = jojo.plant_vegetable("pickle");

        assertEquals(test_tomato.get_seed(), 0);
        assertEquals(test_tomato.get_type(), "tomato");
        assertEquals(test_carrot.get_seed(), 0);
        assertEquals(test_carrot.get_type(), "carrot");
        assertEquals(test_pickle.get_seed(), 0);
        assertEquals(test_pickle.get_type(), "pickle");

        // Constructor 2
        test_tomato3 = jojo.plant_vegetable("tomato", 3);

        assertEquals(test_tomato3.get_seed(), 3);
        assertEquals(test_tomato3.get_type(), "tomato");

        // Upper ans lower cases
        test_tomato2 = jojo.plant_vegetable("TomAto");

        assertEquals(test_tomato2.get_type(), "tomato");

        // Except cases
        assertThrows(() -> jojo.plant_vegetable("squash"));
    }

    @Test
    public void testAdd() throws Exception {

        Garden eden = new Garden(10);
        Garden eden2 = new Garden(10);
        Gardener jojo = new Gardener();
        Vegetable stock = jojo.plant_vegetable("carrot", 5);
        Vegetable stock2 = jojo.plant_vegetable("tomato", 3);

        // The garden doesn't contain this type of vegetables
        jojo.add(eden, stock);
        unit_test_add(5, "carrot", eden);

        // The garden already contains this type of vegetable
        jojo.add(eden, stock);
        unit_test_add(10, "carrot", eden);

        // Add two types of vegetables
        jojo.add(eden2, stock);
        jojo.add(eden2, stock2);
        int tomato = eden2.get_vegetables().get("tomato");
        int carrot = eden2.get_vegetables().get("carrot");

        assertEquals(tomato, 3);
        assertEquals(carrot, 5);
        assertEquals(eden2.get_seed(), 8);

        // Surcharged garden
        assertThrows(() -> jojo.add(eden, stock));
    }

    public void unit_test_add(int stock, String type, Garden garden) {

        int getStock = garden.get_vegetables().get(type);
        assertEquals(getStock, stock);
        assertEquals(garden.get_seed(), stock);

    }
}