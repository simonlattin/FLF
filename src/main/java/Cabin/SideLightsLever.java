package Cabin;

import Controls.CentralUnit;

public class SideLightsLever extends Lever {
    private final CentralUnit centralUnit;

    public SideLightsLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void flip() {
        state = centralUnit.flipLever(6,state);
    }
}
