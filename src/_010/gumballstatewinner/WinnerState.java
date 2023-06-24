package _010.gumballstatewinner;


public class WinnerState implements State {

    GumBallMachine gumBallMachine;

    public WinnerState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a(one?) gumball");
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
    public void dispense() { // we are in winner state, which means customer paid. so first we need to ask the machine to release two gumBalls
        gumBallMachine.releaseBall();
        if (gumBallMachine.getCount() == 0) {
            System.out.println("Oops! out of gumBalls");
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        } else {
            gumBallMachine.releaseBall();
            System.out.println("You are a winner! You get two gumBalls for your quarter");
            if(gumBallMachine.getCount() > 0) {
                gumBallMachine.setState(gumBallMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumBalls!-2nd gumBall");
                gumBallMachine.setState(gumBallMachine.getSoldOutState());
            }

        }
    }

    @Override
    public void refill() {
    }
}
