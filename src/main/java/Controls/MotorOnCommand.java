package Controls;

public class MotorOnCommand implements ICommand{
    private final int id = 1;

    public int execute(){
        return id;
    }
}
