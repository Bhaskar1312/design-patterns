package _011.gumball;

import java.rmi.Naming;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        System.out.println("---");
        GumballMachineRemote gumballMachine = null;
        int count;
        if(args.length < 2) {
            System.out.println("Gumball machine <name> <inventory>");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);

            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//"+args[0]+"/gumballMachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
