package Cabin;

import Controls.CentralUnit;
import Lights.Spotlight;

public class FrontlightsLever extends Lever {
    private CentralUnit unit;

    public void flip(){
        state = unit.flipLever(4,state);
    }
}

