package Controls;

public class BluelightsOffCommand implements ICommand{
    private final CentralUnit unit;

    public BluelightsOffCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute() {
        unit.executeCommand(6);
    }
}
