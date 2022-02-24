package Cabin;

import Controls.CentralUnit;

public class WarningLightLever extends Lever {
    private final CentralUnit centralUnit;

    public WarningLightLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void flip(){
        state = centralUnit.flipLever(2,state);
    }
}
