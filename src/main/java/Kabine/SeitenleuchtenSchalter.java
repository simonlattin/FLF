package Kabine;

import Controls.CentralUnit;

public class SeitenleuchtenSchalter extends Schalter{
    private CentralUnit unit;

    public void flip() {
        state = unit.flipLever(6,state);
    }
}
