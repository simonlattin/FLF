package Cabin;

import Actors.Firefighter;

public class Seat {

    private final Respirator respirator;
    private final Position position;
    private Firefighter firefighter;

    public Seat(Position position){
        this.respirator = new Respirator();
        this.position = position;
        this.firefighter = null;
    }

    public Position getPosition() {
        return position;
    }

    public Respirator getRespirator() {
        return respirator;
    }

    public void setFirefighter(Firefighter firefighter) {
        this.firefighter = firefighter;
    }

    public Firefighter getFirefighter() {
        return firefighter;
    }

    public void dismount(){
        this.firefighter = null;
    }
}
