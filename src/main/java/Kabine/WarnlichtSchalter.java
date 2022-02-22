package Kabine;

import Lichter.Warnlicht;

public class WarnlichtSchalter extends Schalter{
    private Warnlicht warningLight;

    public void flip(){
        if(state){
            state = false;
            warningLight.Off();
        } else {
            state = true;
            warningLight.On();
        }
    }
}
