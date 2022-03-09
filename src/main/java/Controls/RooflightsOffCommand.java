package Controls;

public class RooflightsOffCommand implements ICommand{
    private final CentralUnit unit;

    public RooflightsOffCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute(){
        unit.executeCommand(10);
    }
}
