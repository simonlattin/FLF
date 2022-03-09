package Cabin;

import Controls.BluelightsOffCommand;
import Controls.BluelightsOnCommand;

public class BluelightsButton extends ControlButton{

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            unit.setCommand(new BluelightsOffCommand());
            unit.executeCommand();
        } else {
            state = new Active();
            unit.setCommand(new BluelightsOnCommand());
            unit.executeCommand();
        }
    }
}
