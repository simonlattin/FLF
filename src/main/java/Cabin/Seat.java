package Cabin;

import Actors.Firefighter;

public abstract class Seat {

    protected Respirator respirator;
    protected Position position;
    protected Firefighter firefighter;

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
