package Lights;

public class SideLight {
    private final LED led;
    private final Position position;
    private boolean isOn;

    public SideLight(Position position){
        this.position = position;
        led = new LED();
        this.isOn = false;
    }

    public void On(){
        led.On();
        this.isOn = true;
    }

    public void Off(){
        led.Off();
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
