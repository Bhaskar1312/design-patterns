package _004.pizzaAbstractFactory;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;
    Clams clams;

    abstract void prepare(); // This is where we collect ingredients info

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place Pizza in official Pizzastore box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                // if (i < veggies.length-1) {
                //     result.append(", ");
                // }
            }
            result.setLength(result.length()-2);
            result.append("\n");
        }
        if (clams != null) {
            result.append(clams);
            result.append("\n");
        }

        return result.toString();
    }

    public String getName() {
        return name;
    }
}
