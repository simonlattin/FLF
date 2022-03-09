package Cabin;

import Controls.*;

public class RooflightsButton extends ControlButton{

    public RooflightsButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            RooflightsOffCommand command = new RooflightsOffCommand(unit);
            unit.setCommand(command);
            command.execute();
        } else {
            state = new Inactive();
            RooflightsOnCommand command = new RooflightsOnCommand(unit);
            unit.setCommand(command);
            command.execute();

        }
    }
}
