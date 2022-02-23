package Cabin;

public class Seat {

    private final Respirator respirator;
    private final Position position;

    public Seat(Position position){
        this.respirator = new Respirator();
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public Respirator getRespirator() {
        return respirator;
    }
}
