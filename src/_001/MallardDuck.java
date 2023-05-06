package _001;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
