package Cabin;

import Lights.BlueLight;

public class BlueLightLever extends Lever {
    private BlueLight blueLight;

    public void flip(){
        if(state){
            state = false;
            blueLight.Off();
        } else {
            state = true;
            blueLight.On();
        }
    }
}
