package _004.pizzaAbstractFactory;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (item) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case "Veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Veggie Pizza");
            }
        }
        return pizza;
    }
}
