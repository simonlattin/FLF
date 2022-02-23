package Cabin;

import Controls.CentralUnit;

public class SideLightsLever extends Lever {
    private CentralUnit unit;

    public void flip() {
        state = unit.flipLever(6,state);
    }
}
