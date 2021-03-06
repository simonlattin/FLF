package Cabin;

public class BusDoor {

    private final Position position;
    private boolean isOpen;
    private boolean isLocked = false;

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

    public boolean isOpen() {
        return isOpen;
    }
}
