package _003.starbuzzSize;



public class StarBuzzCoffeeSize {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        // beverage.setSize(Beverage.Size.LARGE);
        beverage.setSize(Beverage.Size.MEDIUM);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $"+String.format("%.2f", beverage.cost()));
    }
}
