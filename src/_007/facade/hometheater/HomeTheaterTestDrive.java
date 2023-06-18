package _007.facade.hometheater;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // instantiate components here
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        CdPlayer cd = new CdPlayer("CD Player", amp);
        Projector projector = new Projector("Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");


        // first instantiate facade with all components in the subsystem
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player,
                                                projector, screen, lights, popper);
        // later use simplified interface to watch and end the movie
        homeTheater.watchMovie("The Imitation Game");
        homeTheater.endMovie();
    }
}
