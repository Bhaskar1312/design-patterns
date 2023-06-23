package _010.gumballstate;

public class HasQuarterState implements State {
    GumBallMachine gumBallMachine;

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
        gumBallMachine.setState(gumBallMachine.getSoldState());
        // when the crank is turned, we set machine to sold state. the sold state is retrieved by getSoldState() getter method
    }

    @Override
    public void dispense() {
        System.out.println("No gumBall dispensed");
    }
}
