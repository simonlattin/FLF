package Cabin;

import Controls.CentralUnit;
import Controls.HeadlightsOffCommand;
import Controls.HeadlightsOnCommand;

public class HeadlightsButton extends ControlButton{

    public HeadlightsButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

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
