package Cabin;

import Controls.CentralUnit;

public class ElectricMotorLever extends Lever {
    private CentralUnit unit;

    public void flip(){
        state = unit.flipLever(1,state);
    }
}
