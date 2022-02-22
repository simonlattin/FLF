package Kabine;

import Controls.CentralUnit;

public class Lenkrad {

    private int lenkWinkel;
    private CentralUnit unit;

    public Lenkrad(){
        this.lenkWinkel = 0;
    }

    public void turnRight(int winkel){
        lenkWinkel = lenkWinkel + winkel;
        unit.turn(lenkWinkel);
    }

    public void turnleft(int winkel){
        lenkWinkel = lenkWinkel - winkel;
    }

    public int getLenkWinkel() {
        return lenkWinkel;
    }
}
