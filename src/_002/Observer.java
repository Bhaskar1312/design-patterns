package _002;

public interface Observer {
    // The observer interface is implemented by all the observers, so they have to implement the update method

    // void update(float temp, float humidity, float pressure); // pull-based
    // // These are the state values that Observers get from the subject when a weather measurement changes

    void update(); // for pull-based

}
