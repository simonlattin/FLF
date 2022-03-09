package Controls;

public class HeadlightsOnCommand implements ICommand{
    private final CentralUnit unit;

    public HeadlightsOnCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute() {
        unit.executeCommand(7);
    }
}
