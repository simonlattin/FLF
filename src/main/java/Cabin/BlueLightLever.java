package Cabin;

import Controls.CentralUnit;

public class BlueLightLever extends Lever {
    private CentralUnit unit;

    public void flip(){
        state = unit.flipLever(3,state);
    }
}
