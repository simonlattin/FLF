package Cabin;

import Controls.CentralUnit;

public class SeitenleuchtenLever extends Lever {
    private CentralUnit unit;

    public void flip() {
        state = unit.flipLever(6,state);
    }
}
