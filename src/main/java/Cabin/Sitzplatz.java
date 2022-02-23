package Cabin;

public class Sitzplatz {

    private final Respirator respirator;
    private final Position position;

    public Sitzplatz(Position position){
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
