package Controls;

public class SidelightsOnCommand implements ICommand{
    private final CentralUnit unit;

    public SidelightsOnCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute(){
        unit.executeCommand(11);
    }
}
