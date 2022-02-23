package Cabin;

import Controls.CentralUnit;

public class SteeringWheel {

    private int steeringDegree;
    private CentralUnit unit;

    public SteeringWheel(){
        this.steeringDegree = 0;
    }

    public void turnRight(int winkel){
        steeringDegree = steeringDegree + winkel;
        unit.turn(steeringDegree);
    }

    public void turnleft(int winkel){
        steeringDegree = steeringDegree - winkel;
    }

    public int getLenkWinkel() {
        return steeringDegree;
    }
}
