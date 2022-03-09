package Controls;

public class HeadlightsOnCommand implements ICommand{
    private final int id = 7;

    public int execute() {
        return id;
    }
}
