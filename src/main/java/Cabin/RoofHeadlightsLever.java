package Cabin;

import Controls.CentralUnit;

public class RoofHeadlightsLever extends Lever {
    private CentralUnit unit;

    public void flip() {
        state = unit.flipLever(5,state);
    }
}
