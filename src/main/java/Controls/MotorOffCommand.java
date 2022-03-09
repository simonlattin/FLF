package Controls;

public class MotorOffCommand implements ICommand {
    private final CentralUnit unit;

    public MotorOffCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute(){
        unit.executeCommand(2);
    }
}
