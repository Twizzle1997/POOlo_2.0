package classes.Vegetables;

public class Pickle extends Vegetable
{
    public void grow(int number)
    {
        this.set_seed(this.get_seed()+number);
    }
}