package Battery;

import java.util.List;

public class MainCell extends AbstractCell {

    public MainCell(){
        for (int i = 0; i < 100; i++){
            cells.add(new Subcell());
        }
    }

    public List<AbstractCell> getCells() {
        return cells;
    }

    public void charge(){
        for (int i = 0; i < 100; i++) {
            cells.get(i).charge();
        }
        isLoaded = true;
    }

    public void discharge(){
        for (int i = 0; i < 100; i++) {
            cells.get(i).discharge();
        }
        isLoaded = false;
    }


}
