package classes.Vegetables;

public class Pickle extends Vegetable {
    public Pickle() {
        this.set_seed(0);
        this.set_type("pickle");
    }

    public void grow(int number) {
        this.set_seed(this.get_seed() + number);
    }
}