package Cabin;

import Lights.WarningLight;

public class WarnlichtLever extends Lever {
    private WarningLight warningLight;

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
