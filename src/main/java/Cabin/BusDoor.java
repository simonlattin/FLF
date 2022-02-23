package Cabin;

public class BusDoor {

    private final Position position;
    private boolean isOpen;

    public BusDoor(Position position){
        this.position = position;
        this.isOpen = false;
    }

    public Position getPosition() {
        return position;
    }

    public void pressButton(){
        isOpen = !isOpen;
    }
}
