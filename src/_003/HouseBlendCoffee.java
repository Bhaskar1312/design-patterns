package _003;

public class HouseBlendCoffee extends Beverage {
    public HouseBlendCoffee() {
        description = "House Blend(Latte)";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
