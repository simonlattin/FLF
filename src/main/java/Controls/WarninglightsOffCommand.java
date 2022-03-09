package Controls;

public class WarninglightsOffCommand implements ICommand{
    private final CentralUnit unit;

    public WarninglightsOffCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute(){
        unit.executeCommand(4);
    }
}
