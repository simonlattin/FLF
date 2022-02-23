package Cabin;

public abstract class Joystick {

    protected Caliper caliper;
    protected PushButton leftButton;
    protected PushButton rightButton;
    protected boolean isAktive;

    public Joystick(){
        this.caliper = new Caliper();
        this.leftButton = new PushButton();
        this.rightButton = new PushButton();
        this.isAktive = false;
    }

}
