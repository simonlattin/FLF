package Controls;

public class MotorOnCommand implements ICommand{
    private final CentralUnit unit;

    public MotorOnCommand(CentralUnit unit){
        this.unit = unit;
    }

    public void execute(){
        unit.executeCommand(1);
    }
}
