package Kabine;

public class Lenkrad {

    private int lenkWinkel;

    public Lenkrad(){
        this.lenkWinkel = 0;
    }

    public void turnRight(int winkel){
        lenkWinkel = lenkWinkel + winkel;
        if (lenkWinkel > 180){
            lenkWinkel = lenkWinkel - 360;
        }
    }

    public void turnleft(int winkel){
        lenkWinkel = lenkWinkel - winkel;
        if (lenkWinkel < -180){
            lenkWinkel = lenkWinkel + 360;
        }
    }

    public int getLenkWinkel() {
        return lenkWinkel;
    }
}
