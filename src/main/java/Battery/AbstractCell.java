package Battery;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCell {

    protected boolean isLoaded;
    protected List<AbstractCell> cells = new ArrayList<>();

    public AbstractCell(){}

    protected void charge(){}

    protected void discharge(){}
}
