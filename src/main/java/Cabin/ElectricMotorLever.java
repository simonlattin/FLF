package Cabin;

import Controls.CentralUnit;

public class ElectricMotorLever extends Lever {
    private final CentralUnit centralUnit;
    private boolean state;

    public ElectricMotorLever(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void flip(){
        centralUnit.flipLever(1,state);
        state = !state;
    }

    public boolean getState(){
        return state;
    }
}
