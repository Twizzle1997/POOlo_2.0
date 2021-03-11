package classes.Vegetables;

public class Carrot extends Vegetable {
    public Carrot() {
        this.set_seed(0);
        this.set_type("carrot");
    }

    public void grow(int number) {
        this.set_seed(this.get_seed() + number);
    }
}