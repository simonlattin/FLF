package Cabin;

import Controls.CentralUnit;

public class SideLightsLever extends Lever {
    private final CentralUnit centralUnit;
    private boolean state;


    public SideLightsLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void flip() {
        centralUnit.flipLever(6,state);
        state = !state;
    }

    public boolean getState(){
        return state;
    }
}
