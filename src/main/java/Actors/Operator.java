package Actors;

import Cabin.Operatorseat;
import Cabin.Seat;

public class Operator extends Firefighter{
    private final Operatorseat seat;

    public Operator(Seat seat){
        this.setFunction(Function.OPERATOR);
        this.seat = (Operatorseat) seat;
    }

    public void pressMotorButton(){
        seat.pressButton(1);
    }

    public void pressWarninglightButton(){
        seat.pressButton(2);
    }

    public void pressBluelightButton(){
        seat.pressButton(3);
    }

    public void pressHeadlightsButton(){
        seat.pressButton(4);
    }

    public void pressRooflightsButton(){
        seat.pressButton(5);
    }

    public void pressSidelightsButton(){
        seat.pressButton(6);
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
