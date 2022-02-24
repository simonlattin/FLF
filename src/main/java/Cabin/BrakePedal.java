package Cabin;

import Controls.CentralUnit;

public class BrakePedal {
    private final CentralUnit centralUnit;

    public BrakePedal(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void brake() {
        centralUnit.brake();
    }
}
