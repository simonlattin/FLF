package Cabin;

import Controls.CentralUnit;

public class WarningLightLever extends Lever {
    private CentralUnit unit;

    public void flip(){
        state = unit.flipLever(2,state);
    }
}
