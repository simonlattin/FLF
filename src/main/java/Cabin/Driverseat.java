package Cabin;

public class Driverseat extends Seat{
    private final GasPedal gasPedal;
    private final BrakePedal brakePedal;
    private final SteeringWheel steeringWheel;
    private final Joystick joystick;

    public Driverseat(Position position, GasPedal gasPedal, BrakePedal brakePedal, SteeringWheel steeringWheel, Joystick joystick){
        this.position = position;
        this.gasPedal = gasPedal;
        this.brakePedal = brakePedal;
        this.steeringWheel = steeringWheel;
        this.joystick = joystick;
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

    public void pressLeftJoystickButton(){
        joystick.pushLeftButton();
    }

    public void pressRightJoystickButton(){
        joystick.pushRightButton();
    }

    public void pressJoystickCaliper(){
        joystick.pushCaliper();
    }
}
