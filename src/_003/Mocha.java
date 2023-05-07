package _003;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Mocha(chocolate)";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    } // We need to compute the cost of beverage with Mocha. First we delegate the call to the object we are
    // decorating so that it can compute the cost, then add Mocha cost to the result.
}
