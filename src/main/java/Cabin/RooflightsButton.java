package Cabin;

import Controls.CentralUnit;
import Controls.RooflightsOffCommand;
import Controls.RooflightsOnCommand;

public class RooflightsButton extends ControlButton{

    public RooflightsButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            unit.setCommand(new RooflightsOffCommand());
            unit.executeCommand();
        } else {
            state = new Active();
            unit.setCommand(new RooflightsOnCommand());
            unit.executeCommand();
        }
    }
}
