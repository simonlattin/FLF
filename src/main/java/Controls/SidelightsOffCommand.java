package Controls;

public class SidelightsOffCommand implements ICommand{
    private final CentralUnit unit;

    public SidelightsOffCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute(){
        unit.executeCommand(12);
    }
}
