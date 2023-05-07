package _003.starbuzzSize;

public abstract class Beverage {
    public enum Size {SMALL, MEDIUM, LARGE}
    Size size = Size.SMALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
