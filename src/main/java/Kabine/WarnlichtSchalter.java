package Kabine;

import Lichter.Warnlicht;

public class WarnlichtSchalter extends Schalter{
    private Warnlicht warningLight;

    public void flip(){
        if(state == true){
            state = false;
        } else {
            state = true;
        }
    }
}
