package Cabin;

import Extinguisher.FrontExtinguisher;
import Extinguisher.RoofExtinguisher;

public abstract class Joystick {

    protected Caliper caliper;
    protected PushButton leftButton;
    protected PushButton rightButton;
    protected boolean isActive;
    protected FrontExtinguisher frontExtinguisher;
    protected RoofExtinguisher roofExtinguisher;

    public Joystick(){
        this.caliper = new Caliper();
        this.leftButton = new PushButton();
        this.rightButton = new PushButton();
        this.isActive = false;
    }

    public abstract void pushLeftButton();

    public abstract void pushRightButton();

    public abstract void pushCaliper();

    public void setExtinguisher(FrontExtinguisher frontExtinguisher, RoofExtinguisher roofExtinguisher){
        this.frontExtinguisher = frontExtinguisher;
        this.roofExtinguisher = roofExtinguisher;
    }


}
