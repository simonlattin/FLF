package Cabin;

import Controls.CentralUnit;

public class RoofHeadlightsLever extends Lever {
    private final CentralUnit centralUnit;

    public RoofHeadlightsLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void flip() {
        state = centralUnit.flipLever(5,state);
    }
}
