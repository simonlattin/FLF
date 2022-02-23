package Cabin;

public class Caliper {

    private boolean isPressed;

    public Caliper(){
        this.isPressed = false;
    }

    public boolean press() {
        this.isPressed = true;
        return isPressed;
    }
}
