package _004.pizzafactoryfranchise;

public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Bhaskar ordered "+pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Bhaskar ordered "+pizza.getName());

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Vinay ordered "+pizza.getName());

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Vinay ordered "+pizza.getName());
    }
}
