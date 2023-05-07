package _003.starbuzzSize;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.SMALL) {
            cost += 0.10;
        } else if(beverage.getSize() == Size.MEDIUM)  {
            cost += .15;
        } else {
            cost += 0.20;
        }
        return cost;
    }
}
