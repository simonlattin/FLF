package Battery;

import java.util.List;

public class Cell extends AbstractCell{

    public Cell(){
        cells = null;
    }

    public List<AbstractCell> getCells() {
        return cells;
    }

    public void charge(){
        isLoaded = true;
    }

    public void discharge(){
        isLoaded = false;
    }

}
