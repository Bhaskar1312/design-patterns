package _003.test;

import _003.Beverage;
import _003.DarkRoast;
import _003.Espresso;
import _003.Mocha;
import _003.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $"+beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+ " $"+beverage2.cost());
    }
}
