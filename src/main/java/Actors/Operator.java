package Actors;

import Cabin.Operatorseat;

public class Operator extends Firefighter{
    private final Operatorseat seat;

    public Operator(Operatorseat seat){
        this.setFunction(Function.OPERATOR);
        this.seat = seat;
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

    public void turnTurnKnobFrontExtinguisher(){
        seat.getControlPanel().turnFrontExtingushierKnob(seat.getControlPanel().getFrontExtinguisherKnob().getState());
    }

    public void turnTurnKnobRoofExtinguisher(){
        seat.getControlPanel().turnRoofExtingushierKnob(seat.getControlPanel().getRoofExtinguisherKnob().getState());
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
