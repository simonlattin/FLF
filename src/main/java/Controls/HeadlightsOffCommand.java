package Controls;

public class HeadlightsOffCommand implements ICommand{
    private final int id = 8;

    public int execute(){
        return id;
    }
}
