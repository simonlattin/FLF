package Cabin;

import Controls.WarninglightsOffCommand;
import Controls.WarninglightsOnCommand;

public class WarninglightsButton extends ControlButton{

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            unit.setCommand(new WarninglightsOffCommand());
            unit.executeCommand();
        } else {
            state = new Active();
            unit.setCommand(new WarninglightsOnCommand());
            unit.executeCommand();
        }
    }
}
