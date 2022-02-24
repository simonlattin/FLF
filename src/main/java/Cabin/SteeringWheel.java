package Cabin;

import Controls.CentralUnit;

public class SteeringWheel {

    private int steeringDegree;
    private final CentralUnit centralUnit;

    public SteeringWheel(CentralUnit centralUnit){
        this.steeringDegree = 0;
        this.centralUnit = centralUnit;
    }

    public void turnRight(int winkel){
        steeringDegree = steeringDegree + winkel;
        centralUnit.turn(steeringDegree);
    }

    public void turnleft(int winkel){
        steeringDegree = steeringDegree - winkel;
    }

    public int getLenkWinkel() {
        return steeringDegree;
    }
}
