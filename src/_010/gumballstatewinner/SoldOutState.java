package _010.gumballstatewinner;


public class SoldOutState implements State {
    private GumBallMachine gumBallMachine;

    public SoldOutState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cant insert, machine is sold-out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You cant eject, you haven;t inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumBalls");
    }

    @Override
    public void dispense() {
        System.out.println("No gumBalls dispensed");
    }

    @Override
    public void refill() {
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }
}
