package Cabin;

import Controls.CentralUnit;
import Controls.SidelightsOffCommand;
import Controls.SidelightsOnCommand;

public class SidelightsButton extends ControlButton{

    public SidelightsButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

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
