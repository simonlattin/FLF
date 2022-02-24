package Cabin;

public class Driverseat extends Seat{
    private final GasPedal gasPedal;
    private final BrakePedal brakePedal;
    private final SteeringWheel steeringWheel;

    public Driverseat(Position position, GasPedal gasPedal, BrakePedal brakePedal, SteeringWheel steeringWheel){
        this.position = position;
        this.gasPedal = gasPedal;
        this.brakePedal = brakePedal;
        this.steeringWheel = steeringWheel;
    }

    public void turn(int degree){
        steeringWheel.turn(degree);
    }

    public void accelerate(){
        gasPedal.accelerate();
    }

    public void brake(){
        brakePedal.brake();
    }
}
