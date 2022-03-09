package Controls;

public class RooflightsOnCommand implements ICommand{
    private final CentralUnit unit;

    public RooflightsOnCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute(){
        unit.executeCommand(9);
    }
}
