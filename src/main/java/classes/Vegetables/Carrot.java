package classes.Vegetables;

public class Carrot extends Vegetable
{
    public void grow(int number)
    {
        this.set_seed(this.get_seed()+number);
    }
}