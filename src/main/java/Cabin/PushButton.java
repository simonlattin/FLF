package Cabin;

public class PushButton {
    private boolean isPressed;

    public PushButton(){
        this.isPressed = false;
    }

    public boolean press() {
        this.isPressed = true;
        return isPressed;
    }
}
