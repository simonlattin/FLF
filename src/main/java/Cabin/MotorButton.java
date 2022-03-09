package Cabin;

import Controls.CentralUnit;
import Controls.MotorOffCommand;
import Controls.MotorOnCommand;

public class MotorButton extends ControlButton{
    private final CentralUnit unit;

    public MotorButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

    public void press() {
        if(state.isActive()){
            state = new Inactive();
            MotorOffCommand command = new MotorOffCommand(unit);
            unit.setCommand(command);
            command.execute();
        } else {
            state = new Inactive();
            MotorOnCommand command = new MotorOnCommand(unit);
            unit.setCommand(command);
            command.execute();

        }
    }
}
