package Controls;

public class HeadlightsOffCommand implements ICommand{
    private final CentralUnit unit;

    public HeadlightsOffCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute() {
        unit.executeCommand(8);
    }
}
