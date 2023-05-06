package _001.test;

import _001.DecoyDuck;
import _001.Duck;
import _001.FlyBehavior;
import _001.FlyRocketPowered;
import _001.MallardDuck;
import _001.ModelDuck;
import _001.QuackBehavior;
import _001.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I can not fly");
        QuackBehavior squeak = () -> System.out.println("Squeaky");
        RubberDuck rubberDuck = new RubberDuck(cantFly, squeak);
        DecoyDuck decoy = new DecoyDuck();

        Duck model = new ModelDuck();

        mallardDuck.performQuack();
        rubberDuck.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
