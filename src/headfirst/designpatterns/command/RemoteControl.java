package headfirst.designpatterns.command;

/**
 * description : Invoker
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommands = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommands = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommands = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommands.undo();
    }

    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getSimpleName()).append("    ")
                    .append(offCommands[i].getClass().getSimpleName()).append("\n");
        }
        stringBuff.append("[undo] ").append(undoCommands.getClass().getSimpleName()).append("\n");
        return stringBuff.toString();
    }

}
