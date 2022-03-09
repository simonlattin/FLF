package Controls;

public class BluelightsOnCommand implements ICommand{
    private final CentralUnit unit;

    public BluelightsOnCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute() {
        unit.executeCommand(5);
    }
}
