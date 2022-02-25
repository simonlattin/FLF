package Cabin;

import Controls.CentralUnit;

public class WarningLightLever extends Lever {
    private final CentralUnit centralUnit;
    private boolean state;

    public WarningLightLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
        state = false;
    }

    public void flip(){
        centralUnit.flipLever(2,state);
        state = !state;
    }

    public boolean getState(){
        return state;
    }
}
