package Cabin;

import Controls.CentralUnit;

public class BreakPedal {
    private final CentralUnit centralUnit;

    public BreakPedal(CentralUnit centralUnit){
        this.centralUnit = centralUnit;
    }

    public void StepOnBrake() {
        centralUnit.brake();
    }
}
