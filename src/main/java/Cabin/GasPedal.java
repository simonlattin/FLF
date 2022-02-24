package Cabin;

import Controls.CentralUnit;

public class GasPedal {
    private final CentralUnit centralUnit;

    public GasPedal(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void accelerate(){
        centralUnit.speedUp();
    }
}
