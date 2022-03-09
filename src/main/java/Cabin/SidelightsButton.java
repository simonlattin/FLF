package Cabin;

import Controls.*;

public class SidelightsButton extends ControlButton{
    private final CentralUnit unit;

    public SidelightsButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            SidelightsOffCommand command = new SidelightsOffCommand(unit);
            unit.setCommand(command);
            command.execute();
        } else {
            state = new Inactive();
            SidelightsOnCommand command = new SidelightsOnCommand(unit);
            unit.setCommand(command);
            command.execute();

        }
    }
}
