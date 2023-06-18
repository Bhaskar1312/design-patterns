package _008.barista;

public abstract class CaffeineBeverage {
    final void prepareRecipe() { // template method
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
