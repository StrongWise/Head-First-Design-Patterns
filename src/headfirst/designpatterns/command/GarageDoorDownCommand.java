package headfirst.designpatterns.command;

/**
 * description : Command
 */
public class GarageDoorDownCommand  implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.down();
	}
	public void undo() {
		garageDoor.up();
	}
}
