package Cabin;

import Controls.HeadlightsOffCommand;
import Controls.HeadlightsOnCommand;

public class HeadlightsButton extends ControlButton{

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            unit.setCommand(new HeadlightsOffCommand());
            unit.executeCommand();
        } else {
            state = new Active();
            unit.setCommand(new HeadlightsOnCommand());
            unit.executeCommand();
        }
    }
}
