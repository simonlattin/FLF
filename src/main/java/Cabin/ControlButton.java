package Cabin;

import Controls.CentralUnit;

public abstract class ControlButton {
    protected CentralUnit unit;
    protected IState state;

    public ControlButton(){
        state = new Inactive();
        unit = null;
    }

    public abstract void press();

    public boolean getState(){
        return state.isActive();
    }
}
