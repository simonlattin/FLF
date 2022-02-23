package Cabin;

public abstract class Joystick {

    protected Caliper caliper;
    protected PushButton leftButton;
    protected PushButton rightButton;
    protected boolean isActive;

    public Joystick(){
        this.caliper = new Caliper();
        this.leftButton = new PushButton();
        this.rightButton = new PushButton();
        this.isActive = false;
    }

}
