package _003;

public abstract class Beverage {
    // Abstract component(Beverage) - Concrete Components(Espresso, HouseBlend, Decaf-1.05, DarkRoast-0.99
    // Decorators(Condiments) - Streamed Milk(0.10), Mocha(0.20), Soy(0.15), Whip(0.10)

    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
