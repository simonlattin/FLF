package Kabine;

import Lichter.Blaulicht;

public class BlaulichtSchalter extends Schalter{
    private Blaulicht blueLight;

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
