package classes.Vegetables;

public class Vegetable {

    private int seed;
    private String type;

    public void vegetable(int unSeed, String unType) {
        this.seed = unSeed;
        this.type = unType.toLowerCase();
    }

    public void grow(int number) {
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
