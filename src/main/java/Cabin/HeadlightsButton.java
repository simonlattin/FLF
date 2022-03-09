package Cabin;

import Controls.*;

public class HeadlightsButton extends ControlButton{
    private final CentralUnit unit;

    public HeadlightsButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            HeadlightsOffCommand command = new HeadlightsOffCommand(unit);
            unit.setCommand(command);
            command.execute();
        } else {
            state = new Inactive();
            HeadlightsOnCommand command = new HeadlightsOnCommand(unit);
            unit.setCommand(command);
            command.execute();
        }
    }
}
