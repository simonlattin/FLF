package Cabin;

import Controls.BluelightsOffCommand;
import Controls.BluelightsOnCommand;
import Controls.CentralUnit;

public class BluelightsButton extends ControlButton{

    public BluelightsButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

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
