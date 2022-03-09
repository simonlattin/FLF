package Cabin;

import Controls.MotorOffCommand;
import Controls.MotorOnCommand;

public class MotorButton extends ControlButton{

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            unit.setCommand(new MotorOffCommand());
            unit.executeCommand();
        } else {
            state = new Active();
            unit.setCommand(new MotorOnCommand());
            unit.executeCommand();
        }
    }
}
