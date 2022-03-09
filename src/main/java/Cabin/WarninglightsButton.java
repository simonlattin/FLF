package Cabin;

import Controls.*;

public class WarninglightsButton extends ControlButton{
    private final CentralUnit unit;

    public WarninglightsButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            WarninglightsOffCommand command = new WarninglightsOffCommand(unit);
            unit.setCommand(command);
            command.execute();
        } else {
            state = new Inactive();
            WarninglightsOnCommand command = new WarninglightsOnCommand(unit);
            unit.setCommand(command);
            command.execute();

        }
    }
}
