package Kabine;

public abstract class Joystick {

    protected Taster taster;
    protected PushButton leftButton;
    protected PushButton rightButton;
    protected boolean isAktive;

    public Joystick(){
        this.taster = new Taster();
        this.leftButton = new PushButton();
        this.rightButton = new PushButton();
        this.isAktive = false;
    }

}
