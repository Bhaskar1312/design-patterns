package _010.gumballstatewinner;

import java.util.Random;

public class HasQuarterState implements State {
    GumBallMachine gumBallMachine;

    private Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You cant insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Returning the quarter");
        gumBallMachine.setState(gumBallMachine.getNoQuarterState()); //use getter? or noQuarterState
    }

    @Override
    public void turnCrank() {
        System.out.println("You Turned crank");
        int winner = randomWinner.nextInt(10);
        if(winner == 0 && (gumBallMachine.getCount() > 1)) {
            gumBallMachine.setState(gumBallMachine.getWinnerState());
        } else {
            gumBallMachine.setState(gumBallMachine.getSoldState());
        }
        // gumBallMachine.setState(gumBallMachine.getSoldState());
        // // when the crank is turned, we set machine to sold state. the sold state is retrieved by getSoldState() getter method
    }

    @Override
    public void dispense() {
        System.out.println("No gumBall dispensed");
    }

    @Override
    public void refill() {
    }
}
