package Cabin;

import Controls.CentralUnit;

public class BlueLightLever extends Lever {
    private final CentralUnit centralUnit;

    public BlueLightLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void flip(){
        state = centralUnit.flipLever(3,state);
    }
}
