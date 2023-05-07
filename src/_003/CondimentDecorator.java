package _003;

public abstract class CondimentDecorator extends Beverage {
    // First we need it to be interchangeable with Beverage, so we extend the Beverage class

    Beverage beverage; // Here is the beverage that each decorator will be wrapping. supertype is Beverage, so the decorator can wrap any beverage
    public abstract String getDescription();
}
