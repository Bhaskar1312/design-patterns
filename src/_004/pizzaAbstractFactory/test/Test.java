package _004.pizzaAbstractFactory.test;

import _004.pizzaAbstractFactory.NYPizzaStore;
import _004.pizzaAbstractFactory.Pizza;
import _004.pizzaAbstractFactory.PizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        // will call Pizza pizza = createPizza("cheese");

    }
}
