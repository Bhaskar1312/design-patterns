package _006.remotecontrol;

import _006.simpleremote.GarageDoor;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living room");

        LightsOnCommand livingRoomLightOnCommand = new LightsOnCommand(livingRoomLight);
        LightsOffCommand livingRoomLightOffCommand = new LightsOffCommand(livingRoomLight);
        LightsOnCommand kitchenLightOn = new LightsOnCommand(kitchenLight);
        LightsOffCommand kitchenLightOff = new LightsOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        // GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        // GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        // remoteControl.setCommand(4, garageDoorUp, garageDoorDown);

        /** You can use lambdas or method references on concrete commands
         * and delete all the concrete command classes. You  can only do this
         * when Command interface has one abstract method
         */
        remoteControl.setCommand(4, garageDoor::up, ()-> garageDoor.down());

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);;
        remoteControl.onButtonWasPushed(4);;
        remoteControl.offButtonWasPushed(4);

    }
}
