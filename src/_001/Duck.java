package _001;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All Ducks float, even decoys");
    }
}

// Duck
// MallardDuck - display, fly, quack
// RedheadDuck - display, fly, quack
// RubberDuck - display, quack
// DecoyDuck - display
