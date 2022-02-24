package Cabin;

import Controls.CentralUnit;

public class SteeringWheel {

    private int steeringDegree;
    private final CentralUnit centralUnit;

    public SteeringWheel(CentralUnit centralUnit){
        this.steeringDegree = 0;
        this.centralUnit = centralUnit;
    }

    public void turn(int winkel){
        steeringDegree = steeringDegree + winkel;
        centralUnit.turn(steeringDegree);
    }

//    public void turnRight(int winkel){
//        steeringDegree = steeringDegree + winkel;
//        centralUnit.turn(steeringDegree);
//    }

//    public void turnleft(int winkel){
//        steeringDegree = steeringDegree - winkel;
//        centralUnit.turn(steeringDegree);
//    }

    public int getLenkWinkel() {
        return steeringDegree;
    }
}
