package headfirst.designpatterns.command;

/**
 * description : Command
 */
public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.setTemperature(40);
        hottub.getTemperature();
    }
    public void undo() {
        hottub.off();
        hottub.setTemperature(36);
    }

}
