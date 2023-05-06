package _001;

public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    void display() {
        System.out.println("I'm a real Red Head Duck");
    }
}
