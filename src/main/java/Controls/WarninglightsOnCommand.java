package Controls;

public class WarninglightsOnCommand implements ICommand{
    private final CentralUnit unit;

    public WarninglightsOnCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute(){
        unit.executeCommand(3);
    }
}
