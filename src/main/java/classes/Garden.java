package classes;

import java.util.*;

public class Garden {

    private int seed;
    private final int maxCapacity;
    private final Hashtable<String, Integer> vegetables;
    private final List<String> list_of_vegetables = Arrays.asList("tomato", "carrot", "pickle");

    public Garden() {
        this.seed = 0;
        this.maxCapacity = 20;
        this.vegetables = new Hashtable<>();
    }

    public Garden(int maxCapacity) {
        this.seed = 0;
        this.maxCapacity = maxCapacity;
        this.vegetables = new Hashtable<>();
    }

    public int get_number_type() {
        return this.vegetables.size();
    }

    public int get_seed() {
        return this.seed;
    }

    public Hashtable<String, Integer> get_vegetables() {
        return this.vegetables;
    }

    public int get_maxCapacity() {
        return this.maxCapacity;
    }

    public void set_seed(int number) {
        this.seed = number;
    }

    public void set_vegetables(String key, int value) throws Exception {
        key = key.toLowerCase();
        if (list_of_vegetables.contains(key)) {
            this.vegetables.put(key, value);
        } else {
            throw new Exception("Cet élément n'existe pas. Légumes disponibles : " + list_of_vegetables);
        }
    }

}