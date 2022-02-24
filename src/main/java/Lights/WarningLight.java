package Lights;

public class WarningLight {

    private final LED led;
    private final Color color;
    private boolean isOn;


    public WarningLight(){
        this.color = Color.ORANGE;
        this.led = new LED();
        this.isOn = false;
    }

    public void On(){
        this.led.On();
        this.isOn = true;
    }

    public void Off(){
        this.led.Off();
        this.isOn = false;
    }

    public LED getLed() {
        return led;
    }

    public boolean isOn() {
        return isOn;
    }
}
