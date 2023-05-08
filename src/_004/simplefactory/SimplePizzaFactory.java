package _004.simplefactory;

import _004.simplefactory.CheesePizza;
import _004.simplefactory.PepperoniPizza;
import _004.simplefactory.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
