package Cabin;

import Controls.CentralUnit;

public class SteeringWheel {

    private int steeringDegree;
    private final CentralUnit centralUnit;

    public SteeringWheel(CentralUnit centralUnit){
        this.steeringDegree = 0;
        this.centralUnit = centralUnit;
    }

    public void turn(int degree){
        steeringDegree = steeringDegree + degree;
        centralUnit.turn(steeringDegree);
    }

    public int getSteeringDegree() {
        return steeringDegree;
    }
}
