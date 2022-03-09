package Cabin;

import Controls.CentralUnit;
import Controls.WarninglightsOffCommand;
import Controls.WarninglightsOnCommand;

public class WarninglightsButton extends ControlButton{

    public WarninglightsButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

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
