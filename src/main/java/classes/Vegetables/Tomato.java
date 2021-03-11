package classes.Vegetables;

public class Tomato extends Vegetable {
    public Tomato() {
        this.set_seed(0);
        this.set_type("tomato");
    }

    public void grow(int number) {
        this.set_seed(this.get_seed() + number);
    }
}