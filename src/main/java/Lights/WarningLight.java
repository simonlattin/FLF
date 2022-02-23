package Lights;

public class WarningLight {

    private final LED led;
    private final Color color;


    public WarningLight(){
        this.color = Color.ORANGE;
        this.led = new LED();
    }

    public void On(){
        this.led.On();
    }

    public void Off(){
        this.led.Off();
    }

    public LED getLed() {
        return led;
    }
}
