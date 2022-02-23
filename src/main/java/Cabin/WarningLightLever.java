package Cabin;

import Lights.WarningLight;

public class WarningLightLever extends Lever {
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
