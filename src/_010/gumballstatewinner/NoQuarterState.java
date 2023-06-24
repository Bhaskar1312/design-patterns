package _010.gumballstatewinner;


public class NoQuarterState implements State {
    GumBallMachine gumBallMachine;

    public NoQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumBallMachine.setState(gumBallMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() { // You haven't inserted a quarter
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but haven't inserted a quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first, before dispensing");
    }

    public String toString() {
        return "waiting for turn of crank";
    }

    @Override
    public void refill() {
    }
}
