package _010.gumball;

public class GumBallMachineTestDrive {
    public static void main(String[] args) {
        GumBallMachine gumBallMachine = new GumBallMachine(5);

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.ejectQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.ejectQuarter();

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);
    }
}
