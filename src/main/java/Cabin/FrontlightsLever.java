package Cabin;

import Controls.CentralUnit;

public class FrontlightsLever extends Lever {
    private final CentralUnit centralUnit;
    private boolean state;

    public FrontlightsLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void flip(){
        centralUnit.flipLever(4,state);
        state = !state;
    }

    public boolean getState(){
        return state;
    }
}

