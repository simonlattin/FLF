package Actors;

import Cabin.Driverseat;
import Cabin.Seat;

public class Driver extends Firefighter{
    private final Driverseat seat;

    public Driver(Seat seat){
        this.setFunction(Function.DRIVER);
        this.seat =(Driverseat) seat;
    }

    public void stepOnGas(){
        seat.accelerate();
    }

    public void stepOnBrake(){
        seat.brake();
    }

    public void turn(int degree){
        seat.turn(degree);
    }

    public void pressLeftJoystickButton(){
        seat.pressLeftJoystickButton();
    }

    public void pressRightJoystickButton(){
        seat.pressRightJoystickButton();
    }

    public void pressJoystickCaliper(){
        seat.pressJoystickCaliper();
    }
}
