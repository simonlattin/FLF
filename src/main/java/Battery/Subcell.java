package Battery;

import java.util.List;

public class Subcell extends AbstractCell {


    public Subcell(){
        for (int i = 0; i < 10; i++) {
            cells.add(new Cell());
        }
    }

    public List<AbstractCell> getCells() {
        return cells;
    }

    public void charge(){
        for (int i = 0; i < 10; i++) {
            cells.get(i).charge();
        }
        isLoaded = true;
    }

    public void discharge(){
        for (int i = 0; i < 10; i++) {
            cells.get(i).discharge();
        }
    }
}
