package headfirst.designpatterns.command;

/**
 * description : Command
 */
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.off();
        hottub.setTemperature(36);
    }
    public void undo() {
        hottub.on();
        hottub.setTemperature(40);
        hottub.getTemperature();
    }

}
