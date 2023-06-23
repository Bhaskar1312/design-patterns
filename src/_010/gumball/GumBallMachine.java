package _010.gumball;

import org.w3c.dom.css.CSS2Properties;
import org.w3c.dom.css.CSSPageRule;

public class GumBallMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT; // we start in sold-out as new machine has no gumballs
    int count = 0;

    public GumBallMachine(int count) {
        this.count = count;
        if(count > 0) {
            state = NO_QUARTER; // if it does have gumballs, then no-quarter state
        }
    }

    public void insertQuarter() {
        if(state == HAS_QUARTER) { // quarter is already inserted, we tell the customer
            System.out.println("You can't insert another quarter");
        } else if(state == NO_QUARTER) { // we accept the quarter
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if(state == SOLD_OUT) { // if machine is sold-out, we reject the quarter
            System.out.println("You can't insert a quarter, the machine is sold-out");
        } else if(state == SOLD) { // if customer just bought a gumball, wait until transaction is complete before inserting another quarter
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if(state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if(state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        } else if(state == SOLD) {
            System.out.println("Sorry, you already turned the crank");
        } else if(state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    public void turnCrank() {
        if(state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball!");
        } else if(state == NO_QUARTER) {
            System.out.println("You turned but there is no quarter. We need a quarter first");
        } else if(state == SOLD_OUT) {
            System.out.println("You turned, but there are no gumballs");
        } else if(state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if(state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if(count == 0) {
                System.out.println("We are out of gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if(state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if(state == SOLD_OUT) {
            System.out.println("Gumball dispensed");
        } else if(state == HAS_QUARTER) {
            System.out.println("You need to turn the crank");
        }
        // NO_QUARTER, SOLD_OUT, HAS_QUARTER conditions should never happen, but if does, we should handle them
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}
