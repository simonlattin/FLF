package Cabin;

import Controls.CentralUnit;

public class BlueLightLever extends Lever {
    private final CentralUnit centralUnit;
    private boolean state;

    public BlueLightLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void flip(){
        centralUnit.flipLever(3,state);
        state = !state;
    }

    public boolean getState(){
        return state;
    }
}
