package Cabin;

import Controls.CentralUnit;

public class FrontlightsLever extends Lever {
    private final CentralUnit centralUnit;

    public FrontlightsLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void flip(){
        state = centralUnit.flipLever(4,state);
    }
}

