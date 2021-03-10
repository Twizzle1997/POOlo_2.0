package classes;
import classes.Vegetables.*;

public class Gardener {

    public Vegetable plant_vegetable(String unType, int number) throws Exception {
        String type = unType.toLowerCase();

        if (type.equals("carrot")) {
            Carrot vegetable = new Carrot();
            vegetable.grow(number);
            vegetable.set_type("carrot");
            return vegetable;
        }

        if (type.equals("tomato")) {
            Tomato vegetable = new Tomato();
            vegetable.grow(number);
            vegetable.set_type("tomato");
            return vegetable;
        }

        if (type.equals("pickle")) {
            Pickle vegetable = new Pickle();
            vegetable.grow(number);
            vegetable.set_type("pickle");
            return vegetable;
        } else {
            throw new Exception("Oups ! Nous n'avons plus de légume de type" + unType + " en magasin...");
        }
    }

    public Vegetable plant_vegetable(String unType) throws Exception {
        String type = unType.toLowerCase();

        if (type.equals("carrot")) {
            Carrot vegetable = new Carrot();
            vegetable.grow(0);
            vegetable.set_type("carrot");
            return vegetable;
        }

        if (type.equals("tomato")) {
            Tomato vegetable = new Tomato();
            vegetable.grow(0);
            vegetable.set_type("tomato");
            return vegetable;
        }

        if (type.equals("pickle")) {
            Pickle vegetable = new Pickle();
            vegetable.grow(0);
            vegetable.set_type("pickle");
            return vegetable;
        }

        else {
            throw new Exception("Oups ! Nous n'avons plus de légume de type " + unType + " en magasin...");
        }
    }

    public void add(Garden cls_garden, Vegetable obj) throws Exception {

        if (cls_garden.get_seed() + obj.get_seed() < cls_garden.get_maxCapacity())
        {
            if (cls_garden.get_vegetables().containsKey(obj.get_type()))
            {
                cls_garden.set_vegetables(obj.get_type(), cls_garden.get_vegetables().get(obj.get_type()) + obj.get_seed());
                cls_garden.set_seed(cls_garden.get_seed() + obj.get_seed());
            }else
            {
                cls_garden.set_vegetables(obj.get_type(), obj.get_seed());
                cls_garden.set_seed(cls_garden.get_seed() + obj.get_seed());
            }
        }else {
            throw new Exception("Jardin surchargé ! La capacité maximum de ce jardin est de " + cls_garden.get_maxCapacity() + " graines !");
        }
    }
}

