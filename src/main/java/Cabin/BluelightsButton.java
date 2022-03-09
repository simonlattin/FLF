package Cabin;

import Controls.*;

public class BluelightsButton extends ControlButton{
    private final CentralUnit unit;

    public BluelightsButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            BluelightsOffCommand command = new BluelightsOffCommand(unit);
            unit.setCommand(command);
            command.execute();
        } else {
            state = new Inactive();
            BluelightsOnCommand command = new BluelightsOnCommand(unit);
            unit.setCommand(command);
            command.execute();
        }
    }
}
