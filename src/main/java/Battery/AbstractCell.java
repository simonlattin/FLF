package Battery;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCell {

    protected boolean isLoaded;
    protected List<AbstractCell> cells = new ArrayList<>();

    public AbstractCell(){}

    public List<AbstractCell> getCells() {
        return cells;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    protected void charge(){}

    protected void discharge(){}
}
