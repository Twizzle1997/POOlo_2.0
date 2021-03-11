package classes.Vegetables;

public class Vegetable {

    private int seed;
    private String type;

    public Vegetable() {
        this.seed = 0;
        this.type = "none";
    }

    public void grow(int number) {
        this.set_seed(this.get_seed() + number);
    }

    public int get_seed() {
        return this.seed;
    }

    public String get_type() {
        return this.type;
    }

    public void set_seed(int number) {
        this.seed = number;
    }

    public void set_type(String type) {
        this.type = type;
    }

}
