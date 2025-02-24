package headfirst.designpatterns.command;


/**
 * description :
 */
public class RemoteLoader {
    public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Garage");
		Stereo stereo = new Stereo("Living Room");

		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff = new StereoOffCommand(stereo);

		remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
		remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
		remoteControl.setCommand(2, ceilingFan::high, ceilingFan::off);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
    }
}
