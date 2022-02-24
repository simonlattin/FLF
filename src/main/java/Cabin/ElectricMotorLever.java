package Cabin;

import Controls.CentralUnit;

public class ElectricMotorLever extends Lever {
    private final CentralUnit centralUnit;

    public ElectricMotorLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void flip(){
        state = centralUnit.flipLever(1,state);
    }
}
