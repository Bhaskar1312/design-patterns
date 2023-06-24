package _010.gumballstatewinner;


public class SoldState implements State {

    GumBallMachine gumBallMachine;

    public SoldState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice, doesn't get you another gumBall!");
    }

    @Override
    public void dispense() { // we are in sold state, which means customer paid. so first we need to ask the machine to release a gumBall
        gumBallMachine.releaseBall();
        if(gumBallMachine.getCount() > 0) {
            gumBallMachine.setState(gumBallMachine.getNoQuarterState());
        } else {
            System.out.println("Oops! out of gumBalls");
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {
    }
}
