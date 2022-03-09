package Cabin;

public class Operatorseat extends Seat{

    private final ControlPanel controlPanel;
    private final Joystick joystick;

    public Operatorseat(Position position, ControlPanel controlPanel, Joystick joystick){
        this.position = position;
        this.joystick = joystick;
        this.controlPanel = controlPanel;
    }

    public void pressButton(int option){
        controlPanel.pressButton(option);
    }

    public void turnKnob(int option, char state){
        controlPanel.turnKnob(option, state);
    }

    public ControlPanel getControlPanel(){
        return controlPanel;
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
