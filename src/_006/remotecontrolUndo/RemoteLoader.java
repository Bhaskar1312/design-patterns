package _006.remotecontrolUndo;


public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        Light light = new Light();
        remoteControl.setCommand(0, new LightsOnCommand(light), new LightsOffCommand(light));
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        CeilingFan ceilingFan = new CeilingFan("Dining room");
        remoteControl.setCommand(1, new CeilingFanHighCommand(ceilingFan), new CeilingFanOffCommand(ceilingFan));
        remoteControl.setCommand(2, new CeilingFanMediumCommand(ceilingFan), new CeilingFanOffCommand(ceilingFan));

        remoteControl.onButtonWasPushed(1); // First turn fan on high
        remoteControl.offButtonWasPushed(1); // turn off
        remoteControl.undoButtonWasPushed(); // undo! goes to medium

        remoteControl.onButtonWasPushed(2); // turn on medium
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed(); // undo will go to high

    }
}
