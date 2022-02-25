package Cabin;

import Controls.CentralUnit;

public class RoofHeadlightsLever extends Lever {
    private final CentralUnit centralUnit;
    private boolean state;

    public RoofHeadlightsLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void flip() {
        centralUnit.flipLever(5,state);
        state = !state;
    }

    public boolean getState(){
        return state;
    }
}
