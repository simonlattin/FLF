package Cabin;

import Controls.SidelightsOffCommand;
import Controls.SidelightsOnCommand;

public class SidelightsButton extends ControlButton{

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            unit.setCommand(new SidelightsOffCommand());
            unit.executeCommand();
        } else {
            state = new Active();
            unit.setCommand(new SidelightsOnCommand());
            unit.executeCommand();
        }
    }
}
