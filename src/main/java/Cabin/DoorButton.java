package Cabin;

public class DoorButton {
    private final Position position;
    private final BusDoor door;

    public DoorButton(Position position, BusDoor door){
        this.position = position;
        this.door = door;
    }

    public void push(){
        door.pressButton();
    }
}
