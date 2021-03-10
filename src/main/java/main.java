import classes.*;
import classes.Vegetables.*;

public class main {
    public static void main (String[] args) throws Exception {
        Gardener Thib = new Gardener();
        Garden Eden = new Garden();

        Vegetable stock1 = Thib.plant_vegetable("carrot", 8);
        Vegetable stock2 = Thib.plant_vegetable("Carrot", 3);

        Vegetable stock3 = Thib.plant_vegetable("Tomato");
        stock3.grow(6);

        Thib.add(Eden, stock1);
        Thib.add(Eden, stock2);
        Thib.add(Eden, stock3);

        System.out.println(Eden.get_vegetables());
        System.out.println(Eden.get_number_type());
        System.out.println(Eden.get_seed());

        Garden miniEden = new Garden(10);

        Thib.add(miniEden, stock1);

    }
}

