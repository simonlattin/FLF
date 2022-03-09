package Controls;

public class MotorOffCommand implements ICommand {
    private final int id = 2;

    public int execute(){
        return id;
    }
}
