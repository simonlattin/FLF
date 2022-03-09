package Cabin;

import Controls.CentralUnit;

public abstract class ControlButton {
    protected final CentralUnit unit;
    protected IState state;

    public ControlButton(){
        state = new Inactive();
        unit = null;
    }

    public ControlButton(CentralUnit unit){
        state = new Inactive();
        this.unit = unit;
    }

    public abstract void press();
}
