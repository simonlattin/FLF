package Actors;

import Cabin.Operatorseat;
import Cabin.Seat;

public class Operator extends Firefighter{
    private final Operatorseat seat;

    public Operator(Seat seat){
        this.setFunction(Function.OPERATOR);
        this.seat = (Operatorseat) seat;
    }

    public void flipMotorLever(){
        seat.flipLever(1);
    }

    public void flipWarningLightLever(){
        seat.flipLever(2);
    }

    public void flipBlueLightLever(){
        seat.flipLever(3);
    }

    public void flipHeadLightLever(){
        seat.flipLever(4);
    }

    public void flipRoofLightLever(){
        seat.flipLever(5);
    }

    public void flipSideLightLever(){
        seat.flipLever(6);
    }

    public void turnTurnKnobFrontExtinguisher(char state){
        seat.getControlPanel().turnKnob(1,state);
    }

    public void turnTurnKnobRoofExtinguisher(char state){
        seat.getControlPanel().turnKnob(2,state);
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
